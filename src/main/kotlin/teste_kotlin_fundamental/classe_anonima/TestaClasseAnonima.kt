package teste_kotlin_fundamental.classe_anonima

interface Event {
    fun onSucess()
}

class Programa {
    fun salvar(e: Event) {
        println("Abrindo conexões.")
        println("Salvando valores.")
        println("Sucesso. Conexões fechadas.")
        e.onSucess()
    }
}

fun main() {
    val p = Programa()
    p.salvar()
}