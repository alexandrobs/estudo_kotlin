
/* 6. Sobre as funções criadas nos exercícios 2, 3 e 4. É possível transformá-las em funções de uma única linha? Se sim,
transforme-as.
 */

fun main(){

    contaCaracterString("Alexandro")
    calculaCuboInteiro(10)
    converteMilhaEmKm(1)

    trocaLetras("america")
    trocaLetras2("america")
    trocaLetras3("america")

    println(teste_kotlin_fundamental.trocaLetras("america"))

}

// Ex. 02
fun contaCaracterString(texto: String) = println(texto.length)
// Ex. 03
fun calculaCuboInteiro(number: Int) = println(number*number*number)
// Ex. 04
fun converteMilhaEmKm(milha: Int) = println(milha * 1.6)
// Ex. 05
fun trocaLetras(letra: String) = println(letra.lowercase().replace("a","x"))
// Ex. 05
fun trocaLetras2(letra: String) = println(letra.replace("a","x",true).lowercase())
// Ex. 05
fun trocaLetras3(letra: String) = println(letra.replace("A","x").replace("a", "x").lowercase())