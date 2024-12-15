package com.arttt95.colecoes.testes

fun main() {

    val listaNomes = listOf("Shisui", "Nagato", "Itachi", "Obito", "Hashirama", "Minato")
    val listaNumeros = listOf(2, 1, 3)

//    val novaListaNumeros = listaNumeros.sorted() // ASC -> a...z & 0...9
//    val novaListaNumeros = listaNumeros.sortedDescending() // DESC -> z...a & 9...0

//    val novaListaNomes = listaNomes.sorted() // ASC -> a...z & 0...9
    val novaListaNomes = listaNomes.sortedDescending() // DESC -> z...a & 9...0

    novaListaNomes.forEach { numero ->
        println(numero)
    }
    
}