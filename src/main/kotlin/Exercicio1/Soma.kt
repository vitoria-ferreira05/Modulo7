package Exercicio1

class Soma {
    fun calcularSoma() {
        val numeros = IntArray(5)
        var soma = 0

        print("Digite os numeros: ")
        for (i in 0..4) {
            numeros[i] = readLine()!!.toInt()
        }

        for (somaNumeros in numeros) {
            soma += somaNumeros
        }
        print("Soma dos numeros: " + soma)
    }
}

fun main() {
    val resultadoSoma = Soma()
    resultadoSoma.calcularSoma()
}

