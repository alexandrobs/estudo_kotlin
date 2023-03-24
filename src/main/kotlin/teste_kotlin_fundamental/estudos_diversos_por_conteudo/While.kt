package teste_kotlin_fundamental.estudos_diversos_por_conteudo

fun main() {
    var i = 0

    while (i < 100) {
        print("$i ")
        i++
    }

    var x = 100

    while (x > 0) {
        println(x)
        x--
    }

    val s = "Kotlin"

    var a = 0
    while (a < s.length) {
        print("${s[a]}")
        a++
    }
}