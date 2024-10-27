package fundamentos.variaveis

fun main() {
    var s1 = "Sol"
    var s2 = "Sol"
    var s3 = StringBuilder().append("S").append("o").append("l").toString()

    println(s1 === s2) // true
    println(s1 === s3) // false
}