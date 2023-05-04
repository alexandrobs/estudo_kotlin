package teste_kotlin_fundamental.heranca

//modificadores: public(n precisa colocar e o default), private, protected

//uma class privada pode ser instanciada no mesmo arquivo, em outro arquivo ela n podeprivate class x
//ela tb impede que a classe seja herdada
private class x
//class tem que ser open para outra classe poder herdar ela
open class Eletronico(var marca: String) {

    private var s: String = ""
    //modificador private
    private fun ativarCorrente() {}

    //protected da visibilidade a class e quem herda ela
    protected fun ativarCorrente2() {}
    fun ligar() {
        ativarCorrente()
    }
    fun desligar() {}
}

//a variavel n pode ser var pq a que ela herda ja tem isso
class Computador(marca: String) : Eletronico(marca) {
    fun instalarSoftware() {}
    fun processar() {
        //como essa class herda Eletronico posso chamar seu metodo protected
        ativarCorrente2()
    }
}

fun main() {
    var c: Computador = Computador("DELL")
    c.ligar()
    c.desligar()
    println(c.marca)
    //ativarCorrente so pode ser usado por um eletronico
    //c.ativarCorrente()
    //nao e possivel acessar uma var private tb por outra classe
    //c.s
    //instanciando uma class privada
    x()
    //aqui eu n consigo herdar o metodo protected pq n estou no escopo da class nem de quem herda ela
    //c.ativarCorrente2()

}