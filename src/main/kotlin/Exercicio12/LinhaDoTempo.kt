package Exercicio12

import java.time.Year

class LinhaDoTempo {
    fun verificarAnoDeVida() {
        println("Digite o ano de nascimento:")
        val anoNascimento = readLine()?.toIntOrNull()

        if (anoNascimento != null) {
            val anoAtual = Year.now().value
            val idadeAtual = anoAtual - anoNascimento

            if (idadeAtual >= 0) {
                var ano = anoNascimento
                var idade = 0

                while (ano <= anoAtual) {
                    println("Ano: $ano - Idade: $idade anos")
                    ano++
                    idade++
                }
            } else {
                println("O ano de nascimento tem que ser anterior ou igual ao ano atual")
            }
        } else {
            println("Valor invalido")
        }
    }
}