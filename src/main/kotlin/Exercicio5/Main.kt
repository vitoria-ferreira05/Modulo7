package Exercicio5

fun main(){
    print("Digite o primeiro numero: ")
    val primeiroNumero = readln().toInt()

    print("Digite o segundo numero: ")
    val segundoNumero = readln().toInt()

    Calculadora().calcularOperacoes(primeiroNumero, segundoNumero)
}