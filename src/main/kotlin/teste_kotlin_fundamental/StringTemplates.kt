package teste_kotlin_fundamental

fun main() {

    println(a)
    println(b)

    a = 2

    val s2 = "${b.replace("is", "was")}, but now is $a"

    println(s2)
}

var a = 1
var b = "a is $a"
