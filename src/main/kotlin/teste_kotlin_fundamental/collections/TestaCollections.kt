package teste_kotlin_fundamental.collections

fun main() {

    //iterando uma lista com for
    for (i in lista) {
        println(i)
    }

    //or
    for (i in lista.indices) {
        println("item at $i is ${lista[i]}")
    }
}

val lista = listOf("mamao", "maca", "banana")

