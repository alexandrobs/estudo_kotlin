package teste_kotlin_fundamental

//2. Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres

fun main(){

    contaCaracterString("Alexandro")

}

fun contaCaracterString(texto: String){
    println(texto.length)
}