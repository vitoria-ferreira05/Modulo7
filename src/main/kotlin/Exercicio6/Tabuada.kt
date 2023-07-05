package Exercicio6

fun main(){
    Tabuada().multiplicar()
}

class Tabuada {
    fun multiplicar() {
        for (i in 1..9) {
            println("Tabuada do " + i)
            for (j in 1..10) {
                println("$i x $j = ${i * j}")
            }
            println()
        }
    }
}