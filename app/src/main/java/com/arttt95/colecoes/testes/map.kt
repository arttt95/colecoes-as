package com.arttt95.colecoes.testes

/*data class Produto (
    val nome: String
)*/

fun main() {

    /*val lista = mapOf(
        1001 to "Iphone",
        1002 to "Galaxy",
        1003 to "Asus Book"
    )*/

    /*val produto1 = Produto("Iphone")
    val produto2 = Produto("Galaxy")
    val produto3 = Produto("Notebook")*/

    /*val lista = mutableMapOf(
        "1001" to Produto("Iphone"),
        "1002" to Produto("Galaxy"),
        "1003" to Produto("Notebook")
    )*/

    val lista = mutableMapOf(
        "1001" to "Iphone",
        "1002" to "Galaxy",
        "1003" to "Notebook"
    )

//    println(lista.get("1001"))
//    println(lista["1001"])

//    lista.put("1004", "Xbox")
    lista["1004"] = "Xbox"

    lista.put("1005", "PlayStation")

    lista.remove("1002")

    println(lista.size)

    lista.clear()

    println(lista.size)

    lista.forEach { produto ->
        println("${produto.key} - ${produto.value}")
    }

}