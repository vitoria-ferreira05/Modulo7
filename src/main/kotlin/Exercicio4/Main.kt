package Exercicio4

fun main(){
    print("Digite a base: ")
    val base = readln().toDouble()

    print("Digite a altura: ")
    val altura = readln().toDouble()

    Retangulo().calcularArea(base, altura)
}