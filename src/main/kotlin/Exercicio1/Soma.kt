package Exercicio1

fun main(){
    Soma().calcularSoma()
}
class Soma {
    fun calcularSoma() {
        print("Digite valor de x: ")
        val x = readln().toInt()

        print("Digite valor de y: ")
        val y = readln().toInt()


        var soma = 0

        for (i in x..y) {
            if (i % 13 != 0)
                soma += 1
        }

        print("A soma dos números que nao sao multiplos de 13 entre X e Y: " + soma)

    }
}