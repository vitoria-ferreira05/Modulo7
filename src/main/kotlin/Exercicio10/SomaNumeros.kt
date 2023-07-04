package Exercicio10

class SomaNumeros {
    fun somarNumeros() {
        var numero = 1
        var soma = 0

        while (numero <= 15) {
            soma += numero
            numero++
        }

        println("A soma dos numeros de 1 a 15 e: " + soma)
    }
}

fun main() {
    SomaNumeros().somarNumeros()
}