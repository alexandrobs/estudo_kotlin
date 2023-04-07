package teste_kotlin_fundamental.null_safety

fun main() {
    var s: String? = null

    if (s != null) {
        println(s.length)
    }
}