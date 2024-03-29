package teste_kotlin_fundamental.colecoes

fun main() {
    val data = geraDados()
    println("Tenho dados? ${if(data.any()) "sim" else "nao"}")
    println("Tenho ${data.count()} elementos")
    println(listOf<Int>().any())

    println("Primeira receita: ${data.first().nome}")
    println("Ultima receita: ${data.last().nome}")

    //isso retorna erro pq lista esta vazia
    //first and last em listas vazias vai gerar erro, para isso usamos firstOrNull ou lastOrNull
    //listOf<Int>().first()
    println(listOf<Int>().firstOrNull())
    println(listOf<Int>().lastOrNull())

    println(listOf<Int>(1,2,3,4).sum())
    println(listOf(1.5,1.9,6.8).sum())
    println(listOf<Int>().sum())

    //filter e uso dos predicados, filtros aplicados, o uso das {}

    println(data.sumOf { it.calorias })

    println(data.filter { it.nome == "Lasanha" })

    println(data.filter { it.calorias > 500 })

    println(
        data.filter { it.calorias < 500 }.any()
    )

    println(
        data.any { it.calorias < 100 },
    )

    println(
        data.count { it.calorias > 200 }
    )

    println("take " + data.take(2))

    println(data.takeLast(2))

    data.forEach { println(it.nome) }

    println("**************")

    data.filter { it.calorias > 500 }.forEach { println(it.nome) }

    println(data.maxOf { it.calorias })

    println(data.minOf { it.calorias })

    println(listOf(1, 4, 9).maxOf { it })

    println(listOf(1, 4, 9).maxOrNull())

    println(listOf(1, 4, 9).minOrNull())

    println(data.maxByOrNull { it.calorias })

    println(data.map { it.nome })

    println(data.map { it.ingredientes })

    println(data.map { it.calorias })

    println(data.map { it.calorias }.sum())

    println(data.map { ReceitaNIngredientes(it.nome, it.ingredientes.count()) })

    println(listOf(1, 2, 4).average())

    println(data.map { it.calorias }.average())

    val lst = listOf(1, 2, 3, 4, 5, 1, 1, 2, 34, 53)

    val lstTxt = listOf("a","b","c","s","a")

    println(lst.distinct())

    println(lstTxt.distinct())

    println(data.distinctBy { it.nome })

    println(data.distinctBy { it })

    println(lst.sorted())

    println(lst.sortedDescending())

    println(lst.reversed())

    println(lst.sorted().reversed())

}

fun geraDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingredientes("Presunto", 5),
                Ingredientes("Queijo", 5),
                Ingredientes("Molho de tomate", 1),
                Ingredientes("Manjericao", 10)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Panqueca", 800),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijao", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingredientes("Pao", 1),
                Ingredientes("Hamburguer", 3),
                Ingredientes("Queijo", 1),
                Ingredientes("Catupiry", 1),
                Ingredientes("Bacon", 1),
                Ingredientes("Alface", 1),
                Ingredientes("Tomate", 1),
                )
        ),
        )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())

data class Ingredientes(val nome: String, val quantidade: Int)

data class ReceitaNIngredientes(val nome: String, val nIngrediente: Int)