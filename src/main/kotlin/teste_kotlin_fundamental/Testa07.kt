package teste_kotlin_fundamental

//Scope Function
class Testa07 {
}

fun main(){

    val str: String? = "Hello"

    val length = str?.let {
        println("let () called on $it")
        it.length
    }

    println(str)
    println(length)
}