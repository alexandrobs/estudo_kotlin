package teste_kotlin_fundamental.object_companion_object

class Matematica {

    //companion object so pode ter um por classe
    companion object Nome {
        val PI = 3.1415
        fun teste() {}

        init {
            println("fui inicializado")
        }
    }

    //objects pode ter mais de um, mas com nomes diferentes
    object obj1 {
        val PI = 3.1415
        fun teste() {}
    }

    object obj2 {
        val PI = 3.1415
        fun teste() {}
    }

    //como o lateinit, objects e companion object so sao inicializados quando usados uma unica vez
}

fun main() {
    Matematica.PI
    Matematica.PI
    Matematica.PI
    Matematica.teste()

    Matematica.obj1.PI
    Matematica.obj2.PI

    val m = Matematica()
}