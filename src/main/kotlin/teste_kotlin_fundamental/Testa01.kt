package teste_kotlin_fundamental

class Testa01 {

    data class User (
        val nome: String,
        val idade: Int)

    data class Pessoa (
        val nome: String = "",
        val idade: Int = 0
            )
}

fun main (){

    val sofia = Testa01.User("Sofia", 11)

    val cloneDaSofia = Testa01.User("Sofia", 11)

    println(sofia.nome + " " + sofia.idade)

    val auri = Testa01.Pessoa()

    println(auri)

    println(sofia == cloneDaSofia)

    //metodos da class Data Class que ja vem disponiveis pra uso
    //equals
    println(sofia.equals(cloneDaSofia))
    //toString
    println(sofia)
    //destructuring declarations
    val (nome, idade) = sofia
    println(nome)
    println(idade)
    //copy
    val sarah = sofia.copy("Sarah")
    println(sarah)


    //Listas em kotlin
    //criar lista com listOf e declaração de tipo por inferencia
    val listaNumeros = listOf(1, 6, 3, 5, 2, 4)
    //criar lista com listOf passando o tipo
    val listaPalavras = listOf<String>("amor","odio","horror","banana","igreja")
    //criar lista do tipo List passando o tipo
    val listaDiferente: List<Int> = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println("listaDiferente $listaNumeros")
    //pegando um item da lista por indice
    println(listaPalavras[1])
    //pegando o último item da lista
    println("${listaNumeros[listaNumeros.size -1]}")
    println("${listaPalavras[listaPalavras.size -1]}")
    println("${listaNumeros[listaNumeros.size -2]}")
    println("${listaPalavras[listaPalavras.size -2]}")
    //retornando o tamanho da lista
    println(listaDiferente.size)
    //o último da lista
    println(listaNumeros.last())
    //o primeiro
    println(listaPalavras.first())
    //se contem o elemento na lista
    println(listaPalavras.contains("amor"))
    println(listaPalavras.contains("pipoca"))
    //ordem inversa
    println(listaPalavras.reversed())
    //em ordem crescente
    println(listaNumeros.sorted())
    //em ordem alfabetica
    println(listaPalavras.sorted())

    //maps, LinkedHashMap
    val listaSorvetes = LinkedHashMap<String, Int>()

    listaSorvetes["Chocolate"] = 10
    listaSorvetes["Morango"] = 2

    println(listaSorvetes)

    for ((key, value) in listaSorvetes) {
        println("$key = $value")
    }

    //factory functions
    val listaSapatos = mapOf<String, Int>("Nike" to 1, "Reebok" to 2, "All Star" to 10, "Botas" to 5)

    for ((key, value ) in listaSapatos) {
        println("$key = $value")
    }

    val listaEmpregados = mutableListOf<String>("João Aparecido")
}