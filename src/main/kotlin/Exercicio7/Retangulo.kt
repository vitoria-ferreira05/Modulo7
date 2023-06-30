package Exercicio7

class Retangulo {
    fun calculoRetangulo() {
        println("Digite a base:")
        val base = readLine()?.toDouble()

        println("Digite a altura:")
        val altura = readLine()?.toDouble()

        if (base != null && altura != null) {
            val area = base * altura
            println("A area do retângulo e: " + area)
        } else {
            println("Valores invalidos")
        }
    }
}