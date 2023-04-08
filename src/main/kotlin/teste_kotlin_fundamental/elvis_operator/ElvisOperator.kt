package teste_kotlin_fundamental.elvis_operator

fun main() {

    val str: String? = null

    if (str == null) {
        println("nulo com if")
    } else {
        println(str)
    }

    //operador elvis verifica se a var str e nula, se for ele imprime "nulo", mas aqui poderiamos chamar uma funcao
    //funciona como o if e else acima
    println(str ?: "imprimindo nulo com operador elvis")

    //como faz uma funcao que faça o que o operador ternario faz
    val idade = 18
    val str2 = if (idade >= 18) "Maior de idade" else "Menor de idade"
    //em java seria assim um operador ternario
    //val str3 = idade >= 18 "Maior de idade" : "Menor de idade"

    println(str2)
}