package com.arttt95.colecoes.testes

/*
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

*/
/*open class Instrumento {
    fun sendoTocado() {}
}*//*


abstract class Instrumento {
    abstract fun sendoTocado()
}

class Violao : Instrumento() {
    override fun sendoTocado() {
        println("utilizando CORDAS")
        println("para tocar violão")
    }

    fun afinandoCordas() {
        println("Afinando cordas")
    }
}

class Bateria : Instrumento() {
    override fun sendoTocado() {
        println("utilizando BAQUETAS")
        println("para tocar violão")
    }

    fun ajustarBaqeutas() {
        println("Ajustando baquetas")
    }
}

fun main() {

    val violao: Instrumento = Violao()
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
    // Tela 3 (Violão)
    val bateria1 = Bateria()
    val musico3 = Musico(bateria1)
    musico3.tocar()

}*/
