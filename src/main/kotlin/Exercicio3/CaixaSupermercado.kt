package Exercicio3

fun main() {

    print("Digite a quantidade de produtos comprados:")
    val quantidadeProdutos = readln().toInt()

    var totalPagar = 0.0

    for (i in 1..quantidadeProdutos) {
        print("Digite o preço do produto " + i + ": R$ ")
        totalPagar += readln().toDouble()
    }

    println("Total a pagar: R$ " + totalPagar)
}

