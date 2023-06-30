package Exercicio4

fun main() {
    val temperatura = obterTemperatura()
    val tipoClima = obterTipoClima(temperatura)

    println("O clima "+ tipoClima)
}

fun obterTemperatura(): Double {
    print("Digite a temperatura em graus Celsius: ")
    return readLine()?.toDoubleOrNull() ?: 0.0
}

fun obterTipoClima(temperatura: Double): String {
    return when {
        temperatura <= 18 -> "frio"
        temperatura in 19.0..23.0 -> "agradavel"
        temperatura in 24.0..35.0 -> "quente"
        else -> "muito quente"
    }
}
