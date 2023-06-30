package Exercicio10

class Sucessor {
    fun verificarSucessor() {
        println("Digite um numero inteiro:")
        val numero = readLine()!!.toInt()

        val sucessor = numero + 1

        println("O sucessor de $numero é $sucessor")
    }
}