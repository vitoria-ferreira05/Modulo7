package Exercicio11

fun main() {
    var soma = 0.0

    for (i in 1..15) {
        println("Digite o numero: " + i)
        val numero = readln().toDouble()
        soma += numero
    }

    val media = soma / 15.0
    println("A media dos 15 números: " + media)
}
