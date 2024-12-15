package com.arttt95.colecoes.testes

fun main() {

//    val localizacao = Pair(10, 20)
    val localizacao = 10 to 20
    val identificacao = "nome" to "Cristiano Penaldo"
    val casal = "João" to "Maria"

    println(localizacao.first)
    println(localizacao.second)

    println("----------------------")

    println(identificacao.first)
    println(identificacao.second)

    println("----------------------")

    println(casal.first)
    println(casal.second)

    val referencia = Triple(10, 20, "Pizzaria")

    println("----------------------")

    println(referencia.first)
    println(referencia.second)
    println(referencia.third)

}