package Exercicio8

fun main() {
    val numeroAlunos = lerNumeroAlunos()
    val alunos = Array(numeroAlunos) { lerAluno() }

    exibirMediasAlunos(alunos)
}

fun lerNumeroAlunos(): Int {
    print("Digite o número de alunos: ")
    return readLine()?.toIntOrNull() ?: 0
}

fun lerAluno(): Aluno {
    print("Digite o nome do aluno: ")
    val nome = readLine() ?: ""
    val notas = DoubleArray(3)

    for (i in 0 until 3) {
        print("Digite a nota ${i + 1}: ")
        notas[i] = readLine()?.toDoubleOrNull() ?: 0.0
    }

    return Aluno(nome, notas)
}

fun exibirMediasAlunos(alunos: Array<Aluno>) {
    println("Médias dos alunos:")

    for (aluno in alunos) {
        val media = aluno.notas.average()
        println("Aluno: ${aluno.nome} - Média: $media")
    }
}

data class Aluno(val nome: String, val notas: DoubleArray)
