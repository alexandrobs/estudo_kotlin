package teste_kotlin_fundamental.exercicios_if_else

/*
1. Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura geométrica.
Informar se formam um quadrado (lados iguais)
* */

fun formaQuadrado(numberA: Int, numberB: Int): String{

    if (numberA.equals(numberB)){
        return ("E um quadrado")
    } else {
        return ("Nao e um quadrado")
    }

}

fun quadrado() {
    println("informe lado 1")
    var lado1 = readLine()

    println("informe lado 2")
    var lado2 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val z = lado2.toInt()

        if (x == z) {
            println("e um quadrado")
        } else {
            println("nao e um quadrado")
        }
    }
}

fun main(){
    readLine()?.let { readLine()?.let { it1 -> println(formaQuadrado(it.toInt(), it1.toInt())) } }

    quadrado()
}

/*
3. resposta:

    "Segunda string"
    "Terceira string"

 */