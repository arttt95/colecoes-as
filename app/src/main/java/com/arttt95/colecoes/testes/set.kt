package com.arttt95.colecoes.testes

data class Carro (
    val nome: String,
    val marca: String
)

fun main() {

    /*val lista = setOf(
        "Obito", "Itachi", "Shihui", "Madara", "Obito"
    )*/

    /*val listaMeio = lista.plus("Nagato")
    val novaLista = listaMeio.plus("Pain")*/

//    println(novaLista.size)

    /*println(novaLista.indexOf("Nagato"))
    println(novaLista.first())
    println(novaLista.last())
    println(novaLista.contains<String>("Deidara"))*/

    /*val embaralhada = novaLista.shuffled()

    embaralhada.forEach { nome ->
        println(nome)
    }*/

    /*val lista = mutableSetOf(
        "Obito", "Itachi", "Shihui", "Madara", "Obito"
    )

    lista.add("Nagato")

    lista.remove("Madara")

    lista.clear()*/

    val carro1 = Carro("Jetta", "VolksWagen")
    val carro2 = Carro("Trail Blazer", "Chevrolet")
    val carro3 = Carro("Hilux", "Toyota")

    val lista = mutableSetOf<Carro>(carro1, carro2, carro3)

    lista.forEach { carro ->
        println("Nome: ${carro.nome} | Marca: ${carro.marca}")
    }

}