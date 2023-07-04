package Exercicio9

fun main() {
    val celsius = lerTemperatura()
    val fahrenheit = conversaoTemperatura(celsius)
    exibirResultado(fahrenheit)
}

fun lerTemperatura(): Double {
    print("Digite a temperatura em Celsius: ")
    return readLine()?.toDoubleOrNull() ?: 0.0
}

fun conversaoTemperatura(celsius: Double): Double {
    return (9 * celsius + 160) / 5
}

fun exibirResultado(fahrenheit: Double) {
    println("O grau Celsius convertido para graus Fahrenheit é: $fahrenheit")
}
