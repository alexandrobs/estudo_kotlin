package teste_kotlin_fundamental.exercicios_if_else

//ex. 3 - Qual o resultado das comparações abaixo?

fun main(){

    var a: Boolean = false
    var b: Boolean = false
    var c: Boolean = true
    var d: Boolean = true

    //se a expressao começa com false e é um &&, nao importa os demais itens, sera false tudo
    //false
    println(a && b && c && d)

    //true
    println(!a && !b && (c && d))

    //false
    println(a && ((b || c) || d))

    //true
    println(a || ((!b && c) || !d))

    //da mesma forma se a expressao começa com true e é um ||, nao importa os demais itens, sera true tudo
    println(!a || ((!b && c) || !d))

}