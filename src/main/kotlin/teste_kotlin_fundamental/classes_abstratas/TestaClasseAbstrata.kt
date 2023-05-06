package teste_kotlin_fundamental.classes_abstratas

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