package teste_kotlin_fundamental.estudos_diversos_por_conteudo

fun main() {

    /*
    diferença entre o do while para o while
    o do executa enquanto a condição do while for true
    o while só executa se for true
    * */

    var i = 0
    do {
        print("$i ")
        i++
    } while (i == 1000)

    while (i == 1000){

    }

    println()

    do {
        print("Qual o seu nome?: ")
        val value = readLine()
    } while (value == "")
}