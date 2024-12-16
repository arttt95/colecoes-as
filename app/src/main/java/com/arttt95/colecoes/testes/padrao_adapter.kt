package com.arttt95.colecoes.testes

class TomadaAntiga (val conector: Conector) {

    fun passarEnergia() {

        val qtdPinos = conector.quantidadePinos()

        if(qtdPinos == 2) {
            conector.ligarAparelho()
            println("Quantidade de pinos: $qtdPinos")
            println("Passando energia...")
        } else {
            println("Essa tomada só funciona com dois pinos" +
                    ", você passou $qtdPinos pinos"
            )
        }

    }

}

interface Conector { // INTERFACE -> CRIAÇÃO CONTRATOS/REGRAS A SEREM SEGUIDAS
    fun quantidadePinos() : Int
    fun ligarAparelho()
}

class ConectorAdaptador(val conectorNovoPadrao: ConectorNovoPadrao) : Conector{ // ADAPTADOR

    override fun quantidadePinos() : Int {
        return 2
    }

    override fun ligarAparelho() {
        conectorNovoPadrao.ligarAparelho()
    }

}

class ConectorNovoPadrao : Conector{ // NOVO PADRÃO

    override fun quantidadePinos() : Int {
        return 3
    }

    override fun ligarAparelho() {
        println("Aparelho está ligado!")
        println("Mais de 20 linhas de código")
    }

}

fun main() {

    val conectorNovoPadrao = ConectorNovoPadrao()

    val conectorAdaptador = ConectorAdaptador(conectorNovoPadrao)

    val tomadaAntiga = TomadaAntiga(conectorAdaptador)
    tomadaAntiga.passarEnergia()

}