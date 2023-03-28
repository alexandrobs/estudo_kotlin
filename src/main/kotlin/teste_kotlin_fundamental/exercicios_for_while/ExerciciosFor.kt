package teste_kotlin_fundamental.exercicios_for_while

/*

CONTROLE DE FLUXO - FOR

1. Imprima os números de 1 a 50 na mesma linha em ordem crescente. Saída esperada:
"1 2 3 4 5 6 7 8 9 10...49 50"

2. Imprima os números de 1 a 50 na mesma linha em ordem descrescente. Saída esperada:
"50 49 48 47... 2 1"

3. Usando a resolução do exercício 1, não imprima os números múltiplos de 5.

4. Faça a soma de todos os números no intervalo de 1 a 500.

5. Escreva um programa capaz de receber um número inteiro N e imprimir uma escada de tamanho N usando o caracter #.

    Se a entrada do programa for 3, teremos:                    Se a entrada do programa for 5, teremos:

    #                                                           #
    ##                                                          ##
    ###                                                         ###
                                                                ####
                                                                #####
 */

fun main() {

    //ex 1
    for (i in 1..50) {
        print("$i ")
    }

    println()

    //ex 2
    for (x in 50 downTo 1) {
        print("$x ")
    }

    println()

    //ex 3
    for (z in 1..50) {
        if (z % 5 == 0 || z % 5 == 5) {
            print("")
        } else {
            print("$z ")
        }
    }

    println()

    //ex 4
    var num = 0
    for (y in 1..500) {
        print("$y ")
        num = y
    }
        print(num )

    println()
}