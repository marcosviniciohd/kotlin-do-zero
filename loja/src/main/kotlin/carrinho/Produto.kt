package carrinho

data class Produto(
    val id: Int,
    val valor: Double,
    val qtd: Int,


) {
    override fun toString(): String {
        return "Produto(id=$id, valor=$valor, qtd=$qtd)"
    }
}
