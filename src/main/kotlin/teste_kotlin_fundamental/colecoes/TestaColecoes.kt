package teste_kotlin_fundamental.colecoes

//List, Set e Map

fun main() {

    val list0 = listOf(1, 2, 3, 4, 5)
    val list1: List<Int> = listOf(1, 2, 3, 4, 5)
    val list2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    println(list2[0])
    println(list2.size)

    list2.add(0)
    list2.add(10)
    list2.remove(8)
    list2.removeAt(0)

    println(list2.contains(1))
    list2.clear()

    println(list2)

    listOf<Int>(1, 32, 23, 454)

    val set1 = setOf<Int>(1, 2, 3, 4, 5)
    val set2 = mutableSetOf<Int>(1, 2, 3, 4, 5)

    //ou listas vazias
    listOf<Int>()
    val set3: Set<String> = setOf<String>("ladrao", "bandido", "pilantra", "otario", "otario")
    val set4: MutableSet<String> = mutableSetOf<String>()

    println(set3)

    println(set4)
    set4.add("Boston")
    set4.add("Sao Paulo")
    println(set4)
    set4.remove("Sao Paulo")
    println(set4)
    println(set4.contains("Sao Paulo"))
    println(set4)
    set4.clear()
    println(set4)
    println(set4.size)
    set4.clear()
    println(set4)

}