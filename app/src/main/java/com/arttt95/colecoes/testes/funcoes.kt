package com.arttt95.colecoes.testes

class Matematica {

    fun somar(n1: Int, n2: Int) : Int {

        return n1 + n2

    }

}

/*fun somar(n1: Int, n2: Int) : Int {

    return n1 + n2

}*/

fun subtrair(n1: Int, n2: Int) : Int {

    return n1 - n2

}

fun dividir(n1: Int, n2: Int) : Int {

    return n1 / n2

}

fun multiplicar(n1: Int, n2: Int) : Int {

    return n1 * n2

}

fun calcular( funcao: (Int, Int) -> Int) {
    val ret = funcao(120, 10)
    println(ret)
}

fun imprimirTexto(texto: String) {

    println(texto)

}

/*fun executar() {
    println("Executar")
}

fun executar2() = println("Executar")*/

/*class Botao {

    fun configurarCliqueBotao( nome: String, funcao: ()-> Unit ) {
        funcao()
        println("Nome: $nome")
    }

}*/

class Botao {

    fun configurarCliqueBotao( funcao: (String)-> Unit ) {
        funcao("Penaldo")
    }

}

/*class Clique {
    fun executarClique() {
        println("Executou clique do botão, função comum!")
    }
}*/

fun main() {

    val botao = Botao()

    botao.configurarCliqueBotao {
        println("Executou função lambda executou nome: $it")
    }

//    val clique = Clique()

    /*botao.configurarCliqueBotao(
        clique::executarClique
    )*/

    /*botao.configurarCliqueBotao {
        println("Executou função lambda")
    }*/

    // Função lambda
    /*val funcaoLambda = { nome: String, idade: Int ->
        println("Usuario: $nome | idade: $idade")
    }

    funcaoLambda("Pessi", 33)*/

    /*val matematica = Matematica()
    val ret = matematica.somar(10, 15)*/

    /*val ret = somar(12, 10)

    imprimirTexto("Pessi")

    val ret = calcular( ::somar)
    println(ret)*/

    /*val matematica = Matematica()
    calcular(matematica::somar)*/

}