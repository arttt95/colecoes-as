package com.arttt95.colecoes.testes

fun converterMaiuscula(texto: String) : String {
    texto.uppercase()

    return "-> $texto"
}

fun main() {

    val lista = listOf("Shisui", "Nagato", "Pain", "Obito")

    /*lista.forEach { nome ->
        println("+$nome")
    }

    for (nome in lista) {
        println("+${nome.uppercase()}")
    }*/

    /*val mutLista = mutableListOf<String>()

    lista.forEach { nome ->
        mutLista.add(nome.uppercase())
    }

    println(mutLista)*/

    /*val novaLista = lista.map { nome ->
        converterMaiuscula(nome)
//        nome.uppercase()
//        "-> $nome"
    }*/

    val novaLista = lista.map { it.uppercase() }

    novaLista.forEach { nome ->
        println(nome)
    }

}