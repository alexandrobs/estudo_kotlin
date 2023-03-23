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

fun triangulo() {
    println("informe lado 1")
    var lado1 = readLine()

    println("informe lado 2")
    var lado2 = readLine()

    println("informe lado 3")
    var lado3 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != ""
        && lado3 != null && lado3 != ""
    ) {
        val x = lado1.toInt()
        val z = lado2.toInt()
        val y = lado3.toInt()

        if (x == z && y == z) {
            println("e um triangulo equilatero")
        } else {
            println("nao e um triangulo equilatero")
        }
    }
}

fun main() {

    readLine()?.let {
        readLine()?.let { it1 ->
            readLine()?.let { it2 -> println(trianguloEquilatero(it.toInt(), it1.toInt(), it2.toInt())) }
        }
    }

    triangulo()

}