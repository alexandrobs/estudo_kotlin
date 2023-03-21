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

fun main(){
    readLine()?.let { readLine()?.let { it1 -> println(formaQuadrado(it.toInt(), it1.toInt())) } }
}