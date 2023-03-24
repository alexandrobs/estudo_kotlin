package teste_kotlin_fundamental.estudos_diversos_por_conteudo

fun main(){
    for (i in 1..10 step 2){
        println("$i")
    }

    val str = "ola mundo"
    for (char in str){
        println(char)
    }

    println()

    for (i in 10 downTo 0 step 3){
        println("$i ")
    }


}
