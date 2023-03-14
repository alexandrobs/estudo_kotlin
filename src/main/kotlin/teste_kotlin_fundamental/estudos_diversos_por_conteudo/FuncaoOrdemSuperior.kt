package teste_kotlin_fundamental.estudos_diversos_por_conteudo

class Testa05 {
}

fun main(){

    fun addition_isCorrtect(){
        val list = listOf(1, 2, 3, 4)

        println(list)

        //funcao de ordem superior e lambdas
        //filter, map, reduce, count, find, any, flatMap, groupBy
        val list2 = list.filter { it > 2 }.toList()

        println(list2)
    }
}