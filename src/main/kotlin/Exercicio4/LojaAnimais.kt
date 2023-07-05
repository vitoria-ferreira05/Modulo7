package Exercicio4

class LojaAnimais {

    fun verificarQuantidadeDeAnimais() {

        print("Digite a quantidade de animais na loja: ")
        val quantAnimais = readln().toInt()

        var quantGatos = 0
        var quantCachorros = 0

        for (i in 1..quantAnimais) {
            print("Digite o tipo do animal: \n |Gato ou Cachorro|: ")
            when (readln()) {
                "gato" -> quantGatos++
                "cachorro" -> quantCachorros++
            }
        }

        println("Quantidade de gatos: " + quantGatos)
        println("Quantidade de cachorros: " + quantCachorros)
    }
}
