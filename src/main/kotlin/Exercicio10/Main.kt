package Exercicio10

fun main() {
    val quantidadeDolares = verificarQuantidadeDolares()

    val reais = converterDolarParaReal(quantidadeDolares)

    println("O valor em reais R$ " + reais)
}

fun verificarQuantidadeDolares(): Double {
    print("Digite a quantidade de dólares: ")
    return readln().toDouble()
}

fun converterDolarParaReal(quantidadeDolares: Double): Double {
    return quantidadeDolares * 4.0
}
