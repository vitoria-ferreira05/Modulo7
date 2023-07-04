package Exercicio8

fun main() {
    println("Digite um valor:")
    val n = readLine()?.toIntOrNull()

    if (n != null && n >= 0) {
        val fibonacci = fib(n)
        println("Fib($n) = $fibonacci")
    } else {
        println("Valor inválido!")
    }
}

fun fib(n: Int): Int {
    return when (n) {
        0 -> 0
        1 -> 1
        else -> fib(n - 1) + fib(n - 2)
    }
}
