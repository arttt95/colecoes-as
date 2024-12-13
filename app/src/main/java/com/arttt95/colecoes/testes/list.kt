package com.arttt95.colecoes.testes

data class Cliente(
    val nome: String,
    val idade: Int
)

fun main() {

    /////////////
    // listOf //
    /////////////

    /*val listaArray = arrayOf(
        "Cristiano",
        "Lionel"
    )

    listaArray.forEach { item ->
        println(item)
    }

    listaArray[0] = "Menino Ney"

    listaArray.forEach { item ->
        println(item)
    }*/

//    val listaList: List<String> = listOf("Cristiano Penaldo", "Lionel Pessi")

    ////////////////////
    // multableListOf //
    ////////////////////

    val cliente1 = Cliente("Shisui", 14)
    val cliente2 = Cliente("Itachi", 26)

    val lista: MutableList<String> = mutableListOf(
        "Cristiano Penaldo", "Lionel Pessi", "Menino Ney"
    )
    /*val listaClientes = mutableListOf(
        cliente1, cliente2
    )*/

    /*val novaLista = listOf<String>("Toca no Calleri", "Fofomeno")

    listaMutableList.addAll(novaLista)

    listaMutableList.add("Menino Ney")

//    listaMutableList.remove("Lionel Pessi")
    listaMutableList.removeAt(1)*/

//    lista.clear()

//    println(lista.size)

//    println(lista[0])

    val novaLista = lista.shuffled()

    novaLista.forEach { nome ->
        println(nome)
//        println("Nome: ${cliente.nome} | Idade: ${cliente.idade}")
    }


}