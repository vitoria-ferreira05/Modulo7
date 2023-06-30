package Exercicio1

fun main() {
        println("Digite um número inteiro:")
        val numero = readLine()?.toIntOrNull()

        if (numero != null) {
            val antecessor = numero - 1
            println("O antecessor é " + antecessor)
        } else {
            println("Numero invalido")
        }
    }


