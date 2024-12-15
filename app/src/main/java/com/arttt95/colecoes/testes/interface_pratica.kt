package com.arttt95.colecoes.testes

import java.io.Serializable

// Don't repeat yourself
// Divisão de responsabilidade
// Classees devem utilizar outras classes
// Alto acoplamento | Baixo acoplamento

class Musico (
    private val instrumento: Instrumento
){
    fun tocar() {
        println("Musico tocando")
        instrumento.sendoTocado()
    }
}

/*open class Instrumento {
    fun sendoTocado() {}
}*/

/*abstract class Instrumento {
    abstract fun sendoTocado()
}*/

interface Instrumento { // Composição
    abstract fun sendoTocado()
}

class Violao : Instrumento {
    override fun sendoTocado() {
        println("utilizando CORDAS")
        println("para tocar violão")
    }

    fun afinandoCordas() {
        println("Afinando cordas")
    }
}

class Bateria : Instrumento {
    override fun sendoTocado() {
        println("utilizando BAQUETAS")
        println("para tocar violão")
    }

    fun ajustarBaqeutas() {
        println("Ajustando baquetas")
    }
}

class Guitarra : Instrumento {
    override fun sendoTocado() {
        println("utilizando paleta e cordas")
        println("para tocar guitarra")
    }

    fun ajustandoAmplificador() {
        println("Ajustando amplificador")
    }
}

class Fornecedor : Serializable {}

class Intent {
    fun putExtra(chave: String, serializable: Serializable) {

    }
}

fun main() {

    val fornecedor = Fornecedor()
    val intent = Intent()
//    intent.putExtra("nome", fornecedor)
    intent.putExtra("nome", fornecedor)

    /*val violao: Instrumento = Violao()
    val bateria: Instrumento = Bateria()

    // Tela 1 (Violão)
    val violao1 = Violao()
    val musico1 = Musico(violao1)
    musico1.tocar()

    println("++++++++++++++++++")

    // Tela 2 (Violão)
    val violao2 = Violao()
    val musico2 = Musico(violao2)
    musico2.tocar()

    println("++++++++++++++++++")

    // Tela 3 (Bateria)
    val bateria1 = Bateria()
    val musico3 = Musico(bateria1)
    musico3.tocar()

    println("++++++++++++++++++")

    // Tela 4 (Guitarra)
    val guitarra1 = Guitarra()
    val musico4 = Musico(guitarra1)
    musico4.tocar()
    guitarra1.ajustandoAmplificador()*/

}