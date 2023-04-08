package teste_kotlin_fundamental.let

fun main() {
    val str: String? = null

    if (str != null) {
        str.lowercase()
        str.length
    }

    val str2: String? = "Ola Mundo"

    //usando o let pra simplificar o if e else
    str2?.let {
        //executa caso o it n for nulo
        //corpo
        //scope function
        println(it.lowercase())
        println(it.length)
    }

    str?.let {
        //corpo
        //scope function
        println(it.lowercase())
        println(it.length)
    }
}


