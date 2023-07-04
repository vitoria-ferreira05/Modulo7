package Exercicio11

fun main() {
    println("---PREÇO DE CUSTO---")

    print("Digite o preço de custo do produto: R$ ")
    val precoDeCusto = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite o preço de venda do produto: R$ ")
    val precoDeVenda = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite percentual desejado para acréscimo: ")
    val percentual = readLine()?.toDoubleOrNull() ?: 0.0

    val acrescimo = valorComAcrescimo(precoDeCusto, percentual)

    println("O preço de custo do produto com o acréscimo do percentual é: R$ $acrescimo")

    val valorTotal = precoDeCusto + acrescimo
    println("Valor total: R$ $valorTotal")
}

fun valorComAcrescimo(precoDeCusto: Double, percentual: Double): Double {
    return precoDeCusto * (percentual / 100)
}
