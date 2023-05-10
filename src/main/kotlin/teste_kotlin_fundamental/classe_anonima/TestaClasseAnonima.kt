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
    val p = Programa()
    val e = Evento()
    p.salvar(e)
}