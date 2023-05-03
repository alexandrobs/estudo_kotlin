package teste_kotlin_fundamental.with

import teste_kotlin_fundamental.classes_atributos_metodos.Pessoa

fun main() {

    val p = Pessoa(1985, "Frank")
    p.acordar()
    p.dormir()

    //para chamar os metodos ou atributos da classe de forma mais resumida, usamos o with
    with(p) {
        println(acordar())
        println(dormir())
        println(doc)
    }
}