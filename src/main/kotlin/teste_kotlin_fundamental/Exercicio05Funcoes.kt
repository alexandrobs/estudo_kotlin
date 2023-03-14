package teste_kotlin_fundamental

/* Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras "a" ou "A" por "x".
a. Não deve existir lógica dentro da função main. Deve ser usada somente como ponto de entrada.
b. Escrever uma função para a troca de letras e impressão do valor final.
c. String final deve estar com todas as letras minúsculas.
 */

fun main(){

    println(trocaLetras("america"))

}

fun trocaLetras(letra: String): String {
    var novaLetra = letra.replace("a","x")
    novaLetra.replace("A","x")
    return novaLetra.lowercase()
}