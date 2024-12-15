package com.arttt95.colecoes.testes

data class Produto (
    var nome: String,
    var preco: Double
) {

    fun desativar() {
        println("Produto: $nome | Preço: $preco -> Desativado")
    }

}

class AlertaMensagem {

    fun configurarTitulo(titulo: String) = println(titulo)
    fun configurarDescricao(descricao: String) = println(descricao)

    fun configurarCancelar() = println("Ação cancelar")
    fun configurarAceitar() = println("Ação aceitar")

}

fun salvarProduto(produto: Produto) {
    println("Produto sendo salvo")
}

fun main() {

    // APPLY

    val alertaMensagem = AlertaMensagem()

    /*alertaMensagem.configurarTitulo("Confirmar salvar?")
    alertaMensagem.configurarDescricao(
        "Ao clicar em 'Aceitar' você está confirmando que leu os termos de uso e está" +
                "de acordo."
    )

    alertaMensagem.configurarCancelar()
    alertaMensagem.configurarAceitar()*/

    /*alertaMensagem.apply {
        configurarTitulo("Confirmar salvar?")
        configurarDescricao("Você tem certeza?")
        configurarCancelar()
        configurarAceitar()
    }*/

    // ALSO

    val lista = listOf("Shisui", "Nagato", "Minato", "Obito")

    /*lista
        .map { nome ->
        nome.uppercase()
        }
        .also { objeto ->
            println(objeto)
            objeto
        }*/

    /*val novaLista = lista
        .map { it.uppercase() }
//        .also { println(it) }*/

    lista.run { this
        println(this)
    }

//    lista.forEach { nome ->
//        println("-> $nome")
//    }

    /*var produto: Produto? = null

//     Usuário pode ou não escolher um produto
    produto = Produto("PlayStation", 1500.00)*/

    // LET

    /*if(produto != null) {
        produto.preco  = 1100.00
        salvarProduto(produto)
    }*/
    /*val novoProduto = produto?.let { item ->
        item.preco  *= 0.95
        item.nome = "Alterado"
//        salvarProduto(produto)
        item
    }*/
    /*produto?.let { it -> // Aqui o valor não é null
        it.preco *= 0.95
        salvarProduto(it)
    }*/
    /*println(novoProduto?.nome)
    println(novoProduto?.preco)*/
    /*println(produto?.nome)
    println(produto?.preco)*/

    // RUN

    /*produto?.run {
        desativar()
        // Aqui realizo mais algumas operações se necessário
    }*/

    // WITH

    /*val novoObjeto = with(produto) {
        desativar()
        this
    }*/

}