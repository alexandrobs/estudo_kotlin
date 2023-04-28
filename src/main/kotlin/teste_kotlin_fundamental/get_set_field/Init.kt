package teste_kotlin_fundamental.get_set_field

class Animal(var especie: String) {
    var fala: String = ""

    get() {
        println("acesso get")
        //desse modo fala fica recursivo sendo chamado em loop infinito
        //return fala
        //para resolver essa parte basta usar field
        return field
    }

    set(value) {
        println("acesso set")
        //da mesma forma essa chamada tb e recursiva
        //fala = value
        //resolvemos chamando field
        field = value
    }
}

fun main() {
//    var p: Planeta = Planeta()
//    p.nome
    println(Animal("cachorro").fala)
    var a = Animal("cachorro")
    a.fala = "auuuuuuu"
}