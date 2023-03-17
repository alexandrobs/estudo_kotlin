package teste_kotlin_fundamental

//when - função calcula bonus
fun bonusWhen(cargo: String): Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de Software" -> 1000f
        "Estagiário" -> 500f
        else -> 0f
    }
}

fun main(){
    println(bonusWhen("Gerente"))
    println(bonusWhen("aasasasddad"))
    println(bonusWhen("Coordenador"))
    println(bonusWhen("Engenheiro de Software"))
    println(bonusWhen("Estagiário"))
}