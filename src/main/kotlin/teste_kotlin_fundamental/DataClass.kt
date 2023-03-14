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

}