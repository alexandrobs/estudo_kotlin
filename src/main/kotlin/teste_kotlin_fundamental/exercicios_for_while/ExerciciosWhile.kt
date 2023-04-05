package teste_kotlin_fundamental.exercicios_for_while

/*
CONTROLE DE FLUXO - WHILE

1. Considere uma caixa d'água de 2 mil litros.
Rômulo gostaria de encher a caixa d'água com balões de 7 litros.
Quantos balões cabem na caixa d'água sem que o volume seja excedido?

2.FizzBuss. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
    a. Quando um número for divisível por 3, imprimir Buzz.
    b. Quando um número for divisível por 5, imprimir Fizz.
    c. Quando um número for divisível por 3 e 5, imprimir FizzBuzz.

3. Escreva um programa capaz de receber um texto e imprimi-lo invertido.
    Entrada: Meu nome é Julius.         Saída: suiluJ é emon ueM

4. Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres 'x' e 'o' e retorna
true ou false.
Caso não exista nem 'x' nem 'o', retornar false.
    "xxooox" -> true    "xxxxo" -> false    "bdefghjij" -> false    "ooooxzzzzz" -> false

*/
fun qtdBaloesEncherPiscina() {
    var baloes = 7
    var cxDagua = 2000
    var contador = 0
    var qtdBaloes = 0

    while(qtdBaloes < cxDagua) {
        contador++
        qtdBaloes = baloes * contador
        if (qtdBaloes == cxDagua || qtdBaloes > cxDagua) {
            contador--
            var litrosTotal = contador * baloes
            println("Encheu a piscina com $contador baloes de 7 litros, resultando em $litrosTotal litros")
            break
        }
    }
}

fun qtdBaloes() {
    val capCaixa = 2000
    val capBaloes = 7

    var numBaloes = 0
    while ((numBaloes * capBaloes) + capBaloes < capCaixa) {
        numBaloes++
    }

    println("cabem $numBaloes baloes na caixa dagua")
}

fun imprimeFizzBuss() {
    var num = 0
    while (num < 50) {
        num++
        //poderia usar aqui num 5 % 15 == 0 apenas nesse if
        if (num % 3 == 0 && num % 5 == 0) {
            print("FizzBuzz ")
        } else if (num % 3 == 0) {
            print("Buzz ")
        } else if (num % 5 == 0){
            print("Fizz ")
        } else {
            print("$num ")
        }
    }
}

fun palavraInvertida(txt: String) {
    var i = 0
    while (txt.length > i) {
        i++
    }
    print(txt.reversed())
}

fun palavraInvertida2(txt: String) {
    var i = txt.length - 1
    while (i >= 0) {
        print(txt[i])
        i--
    }
}

fun verificaQtdCaracter(txt: String) {
    var i = 0
    var qtdX = 0
    var qtdO = 0
    while (i < txt.length) {
        if (i < txt.length) {
            var txtContador = txt[i].toString()
            if (txtContador.contains("x")) {
                qtdX++
            }
            if (txtContador.contains("o")) {
                qtdO++
            }
            i++
        }
    }
    if (qtdX == 0 && qtdO == 0) {
        println(false)
    } else if (qtdX == qtdO) {
        println(true)
    } else {
        println(false)
    }
}

fun main(){
    qtdBaloesEncherPiscina()

    qtdBaloes()

    imprimeFizzBuss()

    println()
    palavraInvertida("Meu nome e Julius")

    println()
    palavraInvertida2("Meu nome e Julius")

    println()
    verificaQtdCaracter("xxooox")
    verificaQtdCaracter("xxxxo")
    verificaQtdCaracter("bdefghjij")
    verificaQtdCaracter("ooooxzzzzz")
}


