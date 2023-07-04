package Exercicio6
fun main() {
    val quantidade = lerQuantidade()
    val numeros = lerNumeros(quantidade)
    val menorNumero = numeros.minOrNull()
    println("O menor número é: $menorNumero")
}

fun lerQuantidade(): Int {
    print("Digite a quantidade de numeros: ")
    return readLine()?.toIntOrNull() ?: 0
}

fun lerNumeros(quantidade: Int): IntArray {
    val numeros = IntArray(quantidade) { index ->
        print("Digite o numero ${index + 1}: ")
        readLine()?.toIntOrNull() ?: 0
    }
    return numeros
}



