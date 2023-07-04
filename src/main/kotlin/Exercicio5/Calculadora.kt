package Exercicio5

import java.lang.ArithmeticException

class Calculadora {
    fun calcularOperacoes(primeiroNumero: Int, segundoNumero : Int){

        println("\n---Resultado---")
        val soma = primeiroNumero + segundoNumero
        print("\nResultado da soma: " + soma)

        val subtracao = primeiroNumero - segundoNumero
        print("\nResultado da subtracao: " + subtracao)

        try {
            val divisao = primeiroNumero / segundoNumero
            print("\nResultado da divisao: " + divisao)
        }catch (e: ArithmeticException){
            print("\nDivisao por 0")
        }


        val multiplicao = primeiroNumero * segundoNumero
        print("\nResultado da multiplicacao: "+ multiplicao)
    }
}