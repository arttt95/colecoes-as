package com.arttt95.colecoes.testes

fun main() {

    val listaLanches = listOf("Whooper", "Batata-frita")
    val listaBebidas = listOf("Coca", "Pepsi")

//    val novaLista = listaLanches.union(listaBebidas)

    val listaExclusao = listOf("Batata-frita", "Pepsi")

    val novaLista = listaLanches + listaBebidas

    val listaAtualizada = novaLista - listaExclusao


    listaAtualizada.forEach { item ->
        println(item)
    }

    println(listaAtualizada.size)

}