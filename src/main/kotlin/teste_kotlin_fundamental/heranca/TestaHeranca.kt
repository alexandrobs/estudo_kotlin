package teste_kotlin_fundamental.heranca

//modificadores: public(n precisa colocar e o default), private, protected

//uma class privada pode ser instanciada no mesmo arquivo, em outro arquivo ela n podeprivate class x
//ela tb impede que a classe seja herdada
private class x
//class tem que ser open para outra classe poder herdar ela
open class Eletronico(var marca: String) {

    private var s: String = ""
    //modificador private
    private fun corrente(ativo: Boolean) {}

    //protected da visibilidade a class e quem herda ela
    protected fun ativarCorrente2() {}
    fun ligar() {
        corrente(true)
    }
    //funcao precisa ser open para ter override
    open fun desligar() {
        corrente(false)
    }
}

//a variavel n pode ser var pq a que ela herda ja tem isso
class Computador(marca: String) : Eletronico(marca) {
    fun save() {}

    //overload
    fun save(a: Int) {}

    fun save(a: Int, b: Int) {}

    fun save(a: Float) {}

    fun save(a: Double) {}

    override fun desligar() {
        save()
        super.desligar()
    }

//    override fun toString(): String {
//        println("dfig")
//        return ""
//    }
}

fun main() {
    var c: Computador = Computador("DELL")
    c.ligar()
    c.desligar()
    c.toString()
}