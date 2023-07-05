package Exercicio2

fun main() {
    val valor = 1
    val vetor = IntArray(10)
    vetor[0] = valor

    for (i in 1 until 10) {
        vetor[i] = vetor[i - 1] * 2
    }

    println("Vetor:")
    for (elemento in vetor) {
        println(elemento)
    }
}



