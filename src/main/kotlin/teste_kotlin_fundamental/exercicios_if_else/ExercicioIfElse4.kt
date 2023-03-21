package teste_kotlin_fundamental.exercicios_if_else

/*
2. Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo.
Informar se é um triângulo equilátero (todos os lados iguais).
 */

fun trianguloEquilatero(numberA: Int, numberB: Int, numberC: Int): String {
    if (numberA.equals(numberB) && numberA.equals(numberC)) {
        return "E um triagulo equilatero"
    } else {
        return "Nao e um triangulo equilatero"
    }
}

fun main() {

    readLine()?.let {
        readLine()?.let { it1 ->
            readLine()?.let { it2 -> println(trianguloEquilatero(it.toInt(), it1.toInt(), it2.toInt())) }
        }
    }

}