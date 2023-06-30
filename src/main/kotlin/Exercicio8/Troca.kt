package Exercicio8

class Troca {
    fun trocaDosValores() {
        println("Digite o valor de x:")
        var x = readLine()!!.toInt()

        println("Digite o valor de y:")
        var y = readLine()!!.toInt()

        println("Valores originais: x = $x, y = $y")

        val temp = x
        x = y
        y = temp

        println("Valores trocados: x = $x, y = $y")
    }
}