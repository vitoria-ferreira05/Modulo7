package Exercicio9


fun main() {
    Funcionarios().verificarFerias()
}

class Funcionarios {

    var direitoAFerias = 0
    var semDireitoAFerias = 0

    fun verificarFerias() {

        print("Informe a quantidade de funcionarios na empresa: ")
        val quantidadeFuncionarios = readln().toInt()

        for (i in 1..quantidadeFuncionarios) {
            print("\nInforme o nome do funcionário $i: ")
            val nome = readln()

            print("Informe o tempo de serviço (em meses) do funcionário $i: ")
            val tempoTrabalho = readln().toInt()

            if (tempoTrabalho >= 12) {
                println("$nome tem direito a férias")
                direitoAFerias++
            } else {
                println("$nome não tem direito a férias\n")
                semDireitoAFerias++
            }
        }
        println("Total de funcionários com direito a férias: " + direitoAFerias)
        println("Total de funcionários sem direito a férias: " + semDireitoAFerias)
    }
}