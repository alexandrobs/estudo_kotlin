package teste_kotlin_fundamental

fun main(){

    println(trocaLetras("america"))

}

fun trocaLetras(letra: String): String {
    var novaLetra = letra.replace("a","x")
    novaLetra.replace("A","x")
    return novaLetra.uppercase()
}