package com.arttt95.colecoes.testes

fun main() {

//    val listaFrutas = listOf("maçã", "laranja", "banana")
//    val listaVendas = listOf(100, 500, 150, 1500, 800, 650)
    val listaNomes = listOf("Shisui", "Itachi", "Obito", "Nagato")

    /*val novaLista = listaFrutas.filter { fruta ->
        fruta == "laranja"
    }*/

    /*val novaLista = listaVendas.filter { valor ->
        valor >= 600 // condição (true) ou (false)
    }*/

//    val novaLista = listaVendas.filter { it >= 500 }
//    val novaLista = listaVendas.filter { it >= 500 }

    /*val novaLista = listaNomes.filter { nome ->
        nome.contains("a")
    }*/

    val novaLista = listaNomes.filter { it.contains("i") }

    println(novaLista)

}