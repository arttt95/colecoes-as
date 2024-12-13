package com.arttt95.colecoes.testes

/*class Motorista( val nome: String ) {

    fun exibirDadosMotorista() = println("Motorista: $nome")

    inner class Caminhao( val nomeCaminhao: String ) { //Classe Aninhada | Nested Class
        fun exibirDadosCaminhao() = println("Caminhão: $nomeCaminhao | Motorista: $nome")
    }

}*/

/*data class Pergunta (val pergunta: String, val respostaCerta: Int){ // Normalmente utilizada para tratar dados
    *//*fun exibir() = println("Exibir")*//*
}*/

// Getters e Setters
/*class Usuario () {

    var nome: String = ""
//        get() {
//            return field.uppercase()
//            println("Get: $field")
//        }

//        set(value) {
//            field = "$value"
//            println(field)
//        }
    var idade: Int = 0
//    val maiorIdade
//        get() = idade >= 18

    var maiorIdade: String = ""
        get() {
//            if(idade >= 18) {
//                return "Sim"
//            } else {
//                return "Não"
//            }
            return if(idade >= 18) {
                "Sim"
            } else {
                "Não"
            }
        }

}*/

class Usuario {

    fun salvarTelefones(codigo: Int, vararg telefones: String) {
        for(telefone in telefones) {
            println(
                "Telefone: ($codigo) $telefone"
            )
        }
    }

}

fun main() {

    val usuario = Usuario()
    usuario.salvarTelefones(
        19,
        "99894-9894",
        "99895-9895",
        "99896-9896",
        "99897-9897"
    )

    /*val pessoa = Pessoa()
    pessoa.salvarTelefone(
        11,
        "99894-9894",
        "99895-9895",
        "99896-9896",
        "99897-9897"
    )*/

    /*val usuario = Usuario(*//*"Shisui Uchiha", 14*//*)
    usuario.nome = "Obito"
    usuario.idade = 17

    println("Nome: ${usuario.nome} | Idade: ${usuario.idade} | É de maior? ${usuario.maiorIdade}")*/

    /*val pessoa = Pessoa()
    pessoa.nome = "Itachi Uchiha"

    println("Nome: ${pessoa.nome}")*/

    /*val motorista = Motorista("Cristiano Penaldo")
    val caminhao = motorista.Caminhao("H-112")
    caminhao.exibirDadosCaminhao()
    motorista.exibirDadosMotorista()

    //val motorista = Motorista("Lionel Pessi")
    val caminhao = Motorista.Caminhao("H-240")
    caminhao.exibirDadosCaminhao()

    val motorista = Motorista("Cristiano Penaldo")
    motorista.exibirDadosMotorista()*/

    /*val pergunta1 = Pergunta("Qual a pergunta?", 1)
    val pergunta2 = Pergunta("Qual a pergunta?", 2)

    val (pergunta, resposta) = pergunta1

    val p = pergunta1.pergunta
    val r = pergunta1.respostaCerta

    println(pergunta)
    println(resposta)*/

    /*println(pergunta1) // Pergunta@682a0b20
    println(pergunta2) // Pergunta@3d075dc0*/

//    println(pergunta1 == pergunta2)

}