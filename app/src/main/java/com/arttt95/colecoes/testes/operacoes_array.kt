package com.arttt95.colecoes.testes

fun main() {

    val lista = arrayOf("Pessi", 10, 19.19)

    /*lista.forEach { item ->
        println(item)
    }*/

//    println(lista[2])

//    val novaLista = lista.plus("novo")

//    println(lista.size)

//    println(lista.indexOf("Pessi"))
//    println(lista.first())
//    println(lista.last())
//    println(lista.contains("Pessi"))
    println(lista.shuffle())

    lista.forEach { item ->
        println(item)
    }


}