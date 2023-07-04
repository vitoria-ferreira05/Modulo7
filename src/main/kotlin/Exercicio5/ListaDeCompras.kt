package Exercicio5

import kotlin.system.exitProcess

class ListaDeCompras {
    val lista = mutableListOf<String>()
    fun listaCompras() {

        println("---------Bem-vindo(a)---------")
        print("Quantos itens deseja adicionar na lista?: ")
        val quantidade = readln().toInt()

        for (i in 1..quantidade) {
            print("Nome do produto: ")
            val nomeProduto = readln().trim()
            lista.add(nomeProduto)
        }


        println("----------LISTA DE COMPRAS---------------")
        for (nomeProduto in lista) {
            println(nomeProduto)
        }
    }
}