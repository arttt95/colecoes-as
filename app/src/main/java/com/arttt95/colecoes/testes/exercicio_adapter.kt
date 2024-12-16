package com.arttt95.colecoes.testes

/*
* Esse adaptador é uma interface que define como um adaptador
* deve se comportar
* VOCÊ NÃO IRÁ ALTERAR ESSA INTERFACE
* */
interface Adaptador {

    /*
    * Esse método deve retornar a quantidade de itens que você quer exibir
    * Para isso pode utilizar qualquer tipo de lista, recomendo usar um listOf mesmo ;)
    * */
    fun quantidadeItens() : Int

    /*
    * Esse método é responsável por retornar cada item da lista, utilizando a posição
    * O método irá retornar uma string, e você pode montar o Layout como Quiser
    * */
    fun montarLayoutParaItem(posicao: Int) : String
}

/*
* Esse componente é que será responsável por fazer a listagem dos itens
* para isso passe para o atributo um adaptador
* VOCÊ NÃO IRÁ ALTERAR ESSA CLASSE
* */
class ComponenteListagem {

    var adaptador: Adaptador? = null

    fun executar(){
        if( adaptador != null ){

            val quantidadeItens = adaptador!!.quantidadeItens()
            for ( position in 0 until quantidadeItens){
                val item = adaptador!!.montarLayoutParaItem(position)
                println( item )
            }

        }else{
            println("Configura um adaptador para prosseguir")
        }
    }

}

class MeuAdaptador(
    lista : List<Ninja>
) : Adaptador {

    private val listaItens = lista

    override fun quantidadeItens(): Int {
        return listaItens.size
    }

    override fun montarLayoutParaItem(position: Int): String {
//        return "$position) ${listaItens[position]} -"
        /*return "$position) ${listaItens[position].nome} que " +
                "tem ${listaItens[position].idade} anos de idade"*/
        val ninja = listaItens[position]
        val nome = ninja.nome
        val idade = ninja.idade
        var ret = "$position) Ninja: $nome |Idade: $idade anos de idade\n"
        ret += "------------------------------------------"
        return ret
    }
}

data class Ninja (
    val nome: String,
    val idade: Int
)

fun main() {

//    Lista de itens
//    val listaItens = listOf("jamilton", "ana", "maria", "pedro", "joão")

    val listaItens = listOf(
        Ninja("Shisui", 14),
        Ninja("Nagato", 25),
        Ninja("Minato", 32),
        Ninja("Obito", 27)
    )

    val componenteListagem = ComponenteListagem()
    componenteListagem.adaptador = MeuAdaptador(listaItens)
    componenteListagem.executar()

}