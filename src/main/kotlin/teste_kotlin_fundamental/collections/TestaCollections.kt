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

    //when
    when {
        "abacaxi" in lista -> println("faca uma vitamina")
        "tamarindo" in lista -> println("faca uma torta")
        "banana" in lista -> println("faca uma banana split")
    }
}

val lista = listOf("mamao", "maca", "banana")

