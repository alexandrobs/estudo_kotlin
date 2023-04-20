package teste_kotlin_fundamental.sobre_parametros

fun main() {

    println(media(7f, 6f, 4f))
    println(media(10f, 9f,8f, 5f))
    println(media(10f, 8f))
    println(media(10f, 8f, 9f, 5f, 6f, 9f))
    println(media(false, 10f, 8f, 2, "", false, 98f))

    //ex de uso real de vararg
    arrayOf(2, 2, 3, 6, 2, 6, 45f, false)

    //ex de uso de valor padrao nos parametros
    "skalslasl".startsWith("sk", false)

    println(salary(7000.0f, 300.0f, 5f))

}

//ex funcao com 3 parametros
fun media(n1: Float, n2: Float, n3: Float): Float {
    val soma = n1 + n2 + n3
    return soma / 3;
}

//ex funcao com 4 parametros
fun media(n1: Float, n2: Float, n3: Float, n4: Float): Float {
    val soma = n1 + n2 + n3 + n4
    return soma / 4;
}

//como criar uma funcao que receba n parametros?
fun media(vararg notas: Float): Float {
    var soma = 0f
    for (n in notas) {
        soma += n
    }
    return (soma / notas.size)
}

//usando generics, se tiver mais de um parametro Generic e usar vararg use ele sempre no final dos parametros
fun <T, J> media(abc: J, vararg notas: T): Float {
    var soma = 0f
    for (n in notas) {
        if (n is Float) {
            soma += n
        }
    }
    return (soma / notas.size)
}

/*
como o valor do segundo parametro esta sendo passado nessa posição, ele não funciona como valor padrão,
ele se comporta como no caso do vararg, tendo que ser passado como último parametro
**/
fun salary(salary: Float, hourlyRate: Float = 200.0f, workedTime: Float): Float {
    return salary / hourlyRate * workedTime
}

