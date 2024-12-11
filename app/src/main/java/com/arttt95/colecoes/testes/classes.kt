package com.arttt95.colecoes.testes

class Motorista( val nome: String ) {

    fun exibirDadosMotorista() = println("Motorista: $nome")

    inner class Caminhao( val nomeCaminhao: String ) { //Classe Aninhada | Nested Class
        fun exibirDadosCaminhao() = println("Caminhão: $nomeCaminhao | Motorista: $nome")
    }

}

fun main() {

    val motorista = Motorista("Cristiano Penaldo")
    val caminhao = motorista.Caminhao("H-112")
    caminhao.exibirDadosCaminhao()
    motorista.exibirDadosMotorista()

    //val motorista = Motorista("Lionel Pessi")
    /*val caminhao = Motorista.Caminhao("H-240")
    caminhao.exibirDadosCaminhao()*/

    /*val motorista = Motorista("Cristiano Penaldo")
    motorista.exibirDadosMotorista()*/

}