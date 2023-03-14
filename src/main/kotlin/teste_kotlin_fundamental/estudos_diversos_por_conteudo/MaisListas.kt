package teste_kotlin_fundamental.estudos_diversos_por_conteudo

class Testa04 {
}

fun main(){
    val numbers = mutableListOf(1, 2, 3, 4)

    println(numbers)

    numbers.add(5)

    println(numbers)

    var numbers2 = listOf(1, 2, 3, 4, 4)

    println(numbers2)

    //isso nao pode listOf n e mutavel
    //numbers2.add(5)

    val numbers3 = setOf(1, 2, 3, 4, 4)

    println(numbers3)

    val numbersMap = mutableMapOf("one" to 1, "two" to 2)

    println(numbersMap)

    numbersMap.remove("one")

    println(numbersMap)

    var numbersMap2 = mapOf("one" to 1, "two" to 2)

    println(numbersMap2)

    //isso nao roda pq n mutavel mapOf
    //numbersMap2.remove("one")

}