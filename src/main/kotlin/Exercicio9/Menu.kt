package Exercicio9

class Menu {
    fun apresentarMenu(){
        println("Digite o primeiro número:")
        val primeiroNumero = readLine()?.toIntOrNull()

        println("Digite o segundo número:")
        val segundoNumero = readLine()?.toIntOrNull()

        if (primeiroNumero != null && segundoNumero != null) {
            println("Escolha uma opção:")
            println("1. Somar os números")
            println("2. Subtrair os números")
            println("3. Multiplicar os números")
            println("4. Dividir os números")

            val opcao = readLine()?.toIntOrNull()

            if (opcao != null) {
                val resultado = when (opcao) {
                    1 -> primeiroNumero + segundoNumero
                    2 -> primeiroNumero - segundoNumero
                    3 -> primeiroNumero * segundoNumero
                    4 -> {
                        if (segundoNumero != 0) {
                            primeiroNumero / segundoNumero
                        } else {
                            println("A")
                            return
                        }
                    }

                    else -> {
                        println("Opcao invalida")
                        return
                    }
                }

                println("Resultado operacao: " + resultado)
            } else {
                println("Opcao invalida")
            }
        } else {
            println("Valor invalido")
        }
    }
}
