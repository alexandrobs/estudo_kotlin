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
true ou false. Caso não exista nem 'x' nem 'o', retornar false.
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

fun main(){
    qtdBaloesEncherPiscina()
}


