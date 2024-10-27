package vitrine

data class Produto(
    val codigo: Int,
    val descricao: String,
    val preco: Double,


) {
    override fun toString(): String {
        return "Produto(codigo=$codigo, descricao='$descricao', preco=$preco)"
    }
}
