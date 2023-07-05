package Exercicio7

fun main(){
    Escola().verificarQuantidadeTurmas()
}

class Escola {
    fun verificarQuantidadeTurmas() {
        print("Digite a quantidade de turmas na escola: ")
        val quantidadeTurmas = readln().toInt()

        for (turma in 1..quantidadeTurmas) {
            print("Digite a quantidade de alunos na turma $turma: ")
            val quantidadeAlunos = readln().toInt()

            var soma = 0.0
            for (aluno in 1..quantidadeAlunos) {
                println("Digite a média do aluno: " + aluno)
                soma += readln().toDouble()
            }

            val mediaTurma = soma / quantidadeAlunos
            println("Média da turma $turma: $mediaTurma")
        }
    }

}