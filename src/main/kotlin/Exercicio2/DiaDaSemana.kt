package Exercicio2

class DiaDaSemana {
    fun verificarDiaDaSemana(){
        print("Digite um numero de 1 ao 7 e verifique o dia da semana: ")
        val dia  = readln().toInt()

        val diaDaSemana = when (dia) {
            1 -> "Domingo"
            2 -> "Segunda-Feira"
            3 -> "Terça-Feira"
            4 -> "Quarta-Feira"
            5 -> "Quinta-Feira"
            6 -> "Sexta-Feira"
            7 -> "Sábado"
            else -> "Numero invalido"
        }
        println(diaDaSemana)
    }
}

