
//funcao 02 transformada em funcao de uma unica linha

fun main(){

    contaCaracterString("Alexandro")
    calculaCuboInteiro(10)
    converteMilhaEmKm(1)

}

fun contaCaracterString(texto: String) = println(texto.length)

fun calculaCuboInteiro(number: Int) = println(number*number*number)

fun converteMilhaEmKm(milha: Int) = println(milha * 1.6)
