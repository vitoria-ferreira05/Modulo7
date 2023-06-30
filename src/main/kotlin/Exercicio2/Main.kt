package Exercicio2

fun main() {
    println("Digite sua idade:")
    val idade = readLine()?.toIntOrNull()

    if (idade != null) {
        val diasVividos = idade * 365
        println("Voce ja viveu aproximadamente " + diasVividos + " dias")
    } else {
        println("Idade inválida")
    }
}
