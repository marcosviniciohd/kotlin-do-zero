package fundamentos.variaveis

// const val PI = 3.1415

fun main() {
    var s1: String = "Maria"
    s1 = "João"
    println(s1)

    println(Exemplo().imprimeValorDePI())

}

class Exemplo {
    companion object {
        const val PI = 3.1415
    }

    fun imprimeValorDePI(): Double {
        println(PI)
        return PI
    }
}