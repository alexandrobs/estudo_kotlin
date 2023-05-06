package teste_kotlin_fundamental.classes_abstratas

//herança n pode ser multipla em kotlin, mas podemos usar interface

interface Selvagem {
    fun atacar() {
        print("atacar")
    }
    //interface n guarda estado
    //var m = ""
}

interface Voador {
    fun voar() {
        print("voar")
    }
}

abstract class Mamifero(val nome: String) {

    //classe abstrata guarda
    var m = ""
    fun acordar() {
        println("acordar")
    }
    fun dormir() {
        println("dormir")
    }

    abstract fun falar()
}

class Cachorro(nome: String) : Mamifero(nome), Selvagem, Voador {
    override fun falar() {
        TODO("Not yet implemented")
    }

}

fun main(){
    //classe abstrata n pode ser implementada
    //val m = Mamifero()

    val cao = Cachorro("Doguinho")
    cao.dormir()
    cao.acordar()
    cao.voar()
    cao.atacar()

}