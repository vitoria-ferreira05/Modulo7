package Exercicio3

fun main() {
    println("Digite um número:")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        if (numero % 5 == 0) {
            println("$numero e multiplo de 5")
        } else {
            println("$numero nao e um multiplo de 5")
        }
    } else {
        println("Número inválido")
    }
}
