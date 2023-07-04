package Exercicio1

fun main() {
    val numero = receberNumero()
    val resultadoSoma = (1..numero!!).sum()
    print(resultadoSoma)
}


fun receberNumero(): Int? {
    print("Digite um numero: ")
    val num = readln().toIntOrNull()
    return num
}
