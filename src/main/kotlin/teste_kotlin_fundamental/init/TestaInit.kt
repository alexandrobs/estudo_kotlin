package teste_kotlin_fundamental.init

class Animal(var especie: String) {

    var fala: String = ""

    init {
        if (especie == "cachorro") {
            fala = "au au"
        } else if (especie == "gato") {
            "miau miau"
        } else {
            ""
        }
    }

    fun falar() {
        println(fala)
    }
    //pode ter mais init caso precise
//    init {
//        println("sdf2")
//    }
}

fun main() {
    //nimal("cachorro").falar()
    Animal("gato").falar()
}