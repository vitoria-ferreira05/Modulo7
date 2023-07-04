package Exercicio6

class BandaMusical {


    fun verificarBandaEMusicas(){
        print("Digite o nome de sua banda favorita: ")
        val banda = readln()
        println("Digite as 3 musicas que você mais gosta da banda:")


        val musicas = arrayOf("Musica 1", "Musica 2", "Musica 3")
        for (i in musicas.indices ){
            val musicasBanda = readln()
            val posicao = musicas[i]
            println(posicao + " : " + musicasBanda)
        }
        println("\nNome da banda: " + banda)
        print("Musica 1: \n" + musicas[0] )
        print("Musica 2: \n" + musicas[1] )
        print("Musica 3: \n" + musicas[2] )
    }
}