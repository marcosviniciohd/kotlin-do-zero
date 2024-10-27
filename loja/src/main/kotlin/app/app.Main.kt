package app

import vitrine.Produto
import carrinho.Produto as carrinho

fun main() {
    val cadProdutoVitrine = Produto(1, "Camiseta", 39.90)
    val cadProdutoCarrinho = carrinho(1, 39.90, 1)


    println("Produto vitrine: ${cadProdutoVitrine}")
    println("Produto carrinho: ${cadProdutoCarrinho}")


}