package Exercicio2


fun main() {
    print("Digite seu nome: ")
    receberNomeUsuario(nome = readln())
}

fun receberNomeUsuario(nome: String) {
    print("Nome do usuario: " + nome)
}