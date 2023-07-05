package Exercicio10

fun main(){
    print("Digite o valor de x: ")
    val x = readln().toInt()

    print("Digite o valor de y: ")
    val y = readln().toInt()

    if (x == y || y == x){
        print("Os numeros sao iguais")
    }else{
        print("Os numeros sao diferentes ")
    }
}