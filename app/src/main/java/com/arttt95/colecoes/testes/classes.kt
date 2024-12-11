package com.arttt95.colecoes.testes

/*class Motorista( val nome: String ) {

    fun exibirDadosMotorista() = println("Motorista: $nome")

    inner class Caminhao( val nomeCaminhao: String ) { //Classe Aninhada | Nested Class
        fun exibirDadosCaminhao() = println("Caminhão: $nomeCaminhao | Motorista: $nome")
    }

}*/

data class Pergunta (val pergunta: String, val respostaCerta: Int){ // Normalmente utilizada para tratar dados
    /*fun exibir() = println("Exibir")*/
}

fun main() {

    /*val motorista = Motorista("Cristiano Penaldo")
    val caminhao = motorista.Caminhao("H-112")
    caminhao.exibirDadosCaminhao()
    motorista.exibirDadosMotorista()

    //val motorista = Motorista("Lionel Pessi")
    val caminhao = Motorista.Caminhao("H-240")
    caminhao.exibirDadosCaminhao()

    val motorista = Motorista("Cristiano Penaldo")
    motorista.exibirDadosMotorista()*/

    val pergunta1 = Pergunta("Qual a pergunta?", 1)
    val pergunta2 = Pergunta("Qual a pergunta?", 2)

    val (pergunta, resposta) = pergunta1

    val p = pergunta1.pergunta
    val r = pergunta1.respostaCerta

    println(pergunta)
    println(resposta)

    /*println(pergunta1) // Pergunta@682a0b20
    println(pergunta2) // Pergunta@3d075dc0*/

//    println(pergunta1 == pergunta2)

}