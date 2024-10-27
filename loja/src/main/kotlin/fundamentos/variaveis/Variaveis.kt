package fundamentos.variaveis

fun main() {
    val nome = "Marcos Vinício"
    // Numeros inteiros
    var idade: Byte = 38
    var idade2: Short = 38
    var idade3: Int = 38
    var idade4: Long = 38

    // Numeros reais
    var salario: Float = 1000.0F
    var salario2: Double = 1000.0

    val soma: Float = 0.1F + 0.2F + 0.3F
    val soma1: Double = 0.1 + 0.2 + 0.3

    // Boolean
    var casado: Boolean = true
    var solteiro: Boolean = false
    var estaChovendo: Boolean = false

    if (estaChovendo) {
        println("Está chovendo")
    } else {
        println("Não está chovendo")
    }

    println("=====================================================================")
    var caracter: Char = 'a'

    for (alfabeto in 'a'..'z') {
//        print("$alfabeto ")
        print("${alfabeto.code} ")
    }


//   println(soma)
//   println(soma1)
}