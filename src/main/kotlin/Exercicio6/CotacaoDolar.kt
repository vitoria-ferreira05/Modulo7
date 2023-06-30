package Exercicio6

class CotacaoDolar {
    fun conversao() {
        val cotacaoDolar = 4.86

        println("Digite o valor em dólar:")
        val valorDolar = readLine()?.toDouble()

        if (valorDolar != null) {
            val valorReal = valorDolar * cotacaoDolar
            println("O valor em reais e: R$%.2f".format(valorReal))
        } else {
            println("Valor invalido")
        }
    }
}

