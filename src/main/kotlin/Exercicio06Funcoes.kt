
//funcao 02 transformada em funcao de uma unica linha

fun main(){

    contaCaracterString("Alexandro")
    calculaCuboInteiro(10)
    converteMilhaEmKm(1)
    trocaLetras("america")
    trocaLetras2("america")
    trocaLetras3("america")
    println(teste_kotlin_fundamental.trocaLetras("america"))

}

fun contaCaracterString(texto: String) = println(texto.length)

fun calculaCuboInteiro(number: Int) = println(number*number*number)

fun converteMilhaEmKm(milha: Int) = println(milha * 1.6)
fun trocaLetras(letra: String) = println(letra.lowercase().replace("a","x"))

fun trocaLetras2(letra: String) = println(letra.replace("a","x",true).lowercase())

fun trocaLetras3(letra: String) = println(letra.replace("A","x").replace("a", "x").lowercase())