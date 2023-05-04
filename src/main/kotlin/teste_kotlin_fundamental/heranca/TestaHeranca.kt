package teste_kotlin_fundamental.heranca

//class tem que ser open para outra classe poder herdar ela
open class Eletronico(var marca: String) {
    fun ligar() {}
    fun desligar() {}
}

//a variavel n pode ser var pq a que ela herda ja tem isso
class Computador(marca: String) : Eletronico(marca) {
    fun instalarSoftware() {}
    fun processar() {}
}

fun main() {
    var c: Computador = Computador("DELL")
    c.ligar()
    c.desligar()
    println(c.marca)
}