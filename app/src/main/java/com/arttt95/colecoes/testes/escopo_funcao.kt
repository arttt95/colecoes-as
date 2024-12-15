package com.arttt95.colecoes.testes

var nome: String = "Obito"

class Pessoa {

//    val nome = "Classe Shisui" // Escopo local

}

fun executar() {
//    val nome = "Executou novo nome Nagato" // Escopo local
    nome = "Executou novo nome Nagato"
}

fun main() {

//    nome = "Voltou para Obito"

    executar()

    nome = "Voltou para Obito"

    println(nome)

}