package Exercicio7

class SalaDeAula {

    fun verificarQuantidadeDeAlunos() {

        println("Quantos alunos tem na sua sala?")
        val quantidAlunos = readLine()?.toIntOrNull()

        if (quantidAlunos != null && quantidAlunos > 0) {
            var somaNotas = 0.0

            for (i in 1..quantidAlunos) {
                println("Nota do aluno:")
                val notaAluno = readLine()?.toDoubleOrNull()

                if (notaAluno != null) {
                    somaNotas += notaAluno
                } else {
                    println("Nota invalida")
                }
            }
            val media = somaNotas / quantidAlunos
            println("Media da turma: " + media)
        } else {
            println("Quantidade  de alunos invalida")
        }
    }
}

