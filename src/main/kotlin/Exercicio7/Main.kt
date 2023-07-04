package Exercicio7

fun main() {
    val nome = lerInput("Digite o nome do vendedor: ")
    val salarioFixo = lerInputDouble("Digite o salário fixo do vendedor: ")
    val totalVendas = lerInputDouble("Digite o total de vendas efetuadas: ")
    val salarioFinal = salarioFixo + totalVendas * 0.15
    exibirInformacoes(nome, salarioFixo, salarioFinal)
}

fun lerInput(mensagem: String): String {
    print(mensagem)
    return readLine() ?: ""
}

fun lerInputDouble(mensagem: String): Double {
    return lerInput(mensagem).toDoubleOrNull() ?: 0.0
}

fun exibirInformacoes(nome: String, salarioFixo: Double, salarioFinal: Double) {
    println("Nome do vendedor: $nome")
    println("Salário fixo: R$$salarioFixo")
    println("Salário final (com comissão): R$$salarioFinal")
}

