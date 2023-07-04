package Exercicio3

import kotlin.time.times

fun main() {
    println("---Calculo de IMC---")

    print("Digite seu peso: ")
    val peso = readln().toDouble()

    print("Digite sua altura: ")
    val altura = readln().toDouble()

    val imc = calculoImc(peso, altura)

    println("\n---Classificação e grau de obesidade---")

    if (imc < 18.5) {
        print("MAGREZA - GRAU 0")
    }else if (imc >= 18.5 && imc <= 24.9){
        print("NORMAL - GRAU 0")
    }else if (imc >= 25 && imc <= 29.9){
        print("SOBREPESO - GRAU I")
    }else if (imc >= 30 && imc <= 39.9){
        print("OBESIDADE - GRAU II")
    }else{
        print("OBESIDADE GRAVE - GRAU III")
    }
}

fun calculoImc(peso: Double, altura: Double): Double {
    return peso / (altura * altura)
}
