package teste_kotlin_fundamental.estudos_diversos_por_conteudo

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