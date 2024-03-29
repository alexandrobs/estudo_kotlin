package teste_kotlin_fundamental.colecoes

//List (ordenado, aceita valores duplicados), Set (desordenado, nao pode valores duplicados) e Map (chave e valor, usar a mesma chave sobreescreve o valor)

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
    val set3: Set<String> = setOf<String>("olho", "boca", "cabeça", "pescoço", "orelha")
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

    //Map
    //chave -> valor, sobrescreve a ultima
    //mapOf é imutavel
    val map1 = mapOf<String, String>(Pair("Franca","Paris"), Pair("Alemanha","Berlinz"), Pair("Alemanha", "Berlim"))
    //mutableMapOf e mutavel
    val map2 = mutableMapOf<String, String>(Pair("Franca","Paris"), Pair("Alemanha","Berlinz"), Pair("Alemanha", "Berlim"))
    println(map1)
    println(map1.entries)
    println(map1.values)
    println(map2)
    map2["Brasil"] = "Brasilia"
    println(map2)
    map2.remove("Brasil")
    println(map2.contains("Brasil"))
    map2.clear()
    println(map2)
}