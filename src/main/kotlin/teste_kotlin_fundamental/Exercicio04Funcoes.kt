package teste_kotlin_fundamental

//4. Escreva uma função capaz de receber milhas e converter em km(1 milha = 1,6km)

fun main(){
    converteMilhaEmKm(10)
}

fun converteMilhaEmKm(milha: Int){
    var resultado = milha * 1.6
    println("$milha kilometros = $resultado milhas")
}