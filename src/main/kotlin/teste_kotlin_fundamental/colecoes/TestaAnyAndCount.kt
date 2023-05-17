package teste_kotlin_fundamental.colecoes

fun main() {
    val data = geraDados()
    println("Tenho dados? ${if(data.any()) "sim" else "nao"}")
    println("Tenho ${data.count()} elementos")
    println(listOf<Int>().any())
}

fun geraDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingredientes("Presunto", 5),
                Ingredientes("Queijo", 5),
                Ingredientes("Molho de tomate", 1),
                Ingredientes("Manjericão", 10)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingredientes("Pão", 1),
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