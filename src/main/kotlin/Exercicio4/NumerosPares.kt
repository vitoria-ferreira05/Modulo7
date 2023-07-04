package Exercicio4

class NumerosPares {
    fun verificarNumerosPares(){
        val numeros = mutableListOf<Int>()

        println("Digite os 10 numeros: ")
        for (i in 0..9) {
           val numero = readln().toInt()
            numeros.add(numero)
        }

        print("Os numeros pares da lista são: \n")
        for (numero in numeros){
            if (numero % 2 == 0){
                println(numero)
            }
        }
  }
}



