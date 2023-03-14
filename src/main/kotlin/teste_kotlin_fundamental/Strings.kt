package teste_kotlin_fundamental

class Testa02 {

}

fun main () {

    var optionalString: String? = null

    //isso da erro pq myString n aceita nulo
    //var myString: String = null

    val optionalString2: String? = "Kotlin"

    val lenght = optionalString?.length ?: -1

    val lenght3 = optionalString2?.length ?: -1

    //isso da erro pq optionalString é nula eu assumi a responsabilidade de não ser e falhei
    //val length2 = optionalString!!.length
    //print(length2)

    println("-----------------")
    println(optionalString)
    println(optionalString2)
    println(lenght)
    println(lenght3)

    val length4 = optionalString2!!.length
    println(length4)

    println(optionalString?.length)
    println(optionalString?.length ?: -1)

}