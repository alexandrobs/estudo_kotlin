package teste_kotlin_fundamental.exercicios_if_else

fun bonus(cargo: String, tempoExperiencia: Int): Float {
    var bonus = 0f
    if (cargo == "Gerente" && tempoExperiencia > 3) {
        bonus = 3.000f
    } else if (cargo == "Gerente") {
        bonus = 2.000f
    }
    if (cargo == "Coordenador" && tempoExperiencia > 1) {
        bonus = 1.800f
    } else if (cargo == "Coordenador") {
        bonus = 1.500f
    }
    if (cargo == "Engenheiro de Software") {
        bonus = 1.000f
    } else if (cargo == "Estagiário") {
        bonus = 500f
    }
    return bonus
}

fun main(){
    println(bonus("Gerente", 2))
    println(bonus("Gerente", 10))
    println(bonus("Coordenador", 1))
    println(bonus("Coordenador", 5))
    println(bonus("Engenheiro de Software", 1))
    println(bonus("Engenheiro de Software", 15))
    println(bonus("Estagiário", 2))
    println(bonus("Estagiário", 4))
    println(bonus("Faxineiro", 2))
    println(bonus("Faxineiro", 20))
}

