package teste_kotlin_fundamental.classes_abstratas

//herança n pode ser multipla em kotlin, mas podemos usar interface

interface Selvagem {
    fun atacar()
}

abstract class Mamifero(val nome: String) {
    fun acordar() {
        println("acordar")
    }
    fun dormir() {
        println("dormir")
    }

    abstract fun falar()
}

class Cachorro(nome: String) : Mamifero(nome) {
    override fun falar() {
        TODO("Not yet implemented")
    }

}

fun main(){
    //classe abstrata n pode ser implementada
    //val m = Mamifero()
}