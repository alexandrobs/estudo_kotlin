package teste_kotlin_fundamental.classe_anonima

interface Event {
    fun onSucess()
}

class Programa {
    fun salvar(e: Event) {
        println("Abrindo conexões.")
        println("Salvando valores.")
        println("Sucesso. Conexoes fechadas.")
        e.onSucess()
    }
}

class Evento : Event {
    override fun onSucess() {
        println("Evento criado")
    }
}

fun main() {
    //tendo que criar uma classe Event para passar como parametros
    val p = Programa()
    val e = Evento()
    p.salvar(e)

    //ou usando classe anonima em kotlin
    val p2 = Programa()
    p2.salvar(object : Event {
        override fun onSucess() {
            println("onSucess")
        }
    })
}