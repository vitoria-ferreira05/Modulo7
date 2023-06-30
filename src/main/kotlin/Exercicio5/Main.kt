package Exercicio5

fun main() {
    println("Digite um número:")
    val numero = readLine()?.toDouble()

    if (numero != null) {
        if (numero > 0) {
            println("O numero e positivo.")
        } else if (numero < 0) {
            println("O numero e negativo.")
        } else {
            println("Numero invalido")
        }
    }
}



