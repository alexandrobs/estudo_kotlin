package teste_kotlin_fundamental.exercicios_if_else

/*
1. Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final do ano.
Os bônus são classificados por cargo.
a. Gerentes recebem R$ 2.000,00
b. Coordenadores recebem R$ 1.500,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500.00
*/

fun calculaBonus(cargo: String): Float {
    val bonus = if ( cargo == "Gerente" ) {
        2000f
    } else if ( cargo == "Coordenador" ) {
        1500f
    } else if ( cargo == "Engenheiro de Software" ) {
        1000f
    } else if ( cargo == "Estagiário" ) {
        500f
    } else {
        0f
    }
    return bonus
}

data class Empregado (
    var cargo: String,
    var bonusFinalAno: Float)

val gerente = Empregado("Gerente", 0f)
val coordenador = Empregado("Coordenador", 0f)
val engenheiroSoftware = Empregado("Engenheiro de Software", 0f)
val estagiario = Empregado("Estagiário", 0f)

fun main(){

    if(  gerente.cargo == "Gerente" ) {
        gerente.bonusFinalAno = 2000f
    }
    if (  coordenador.cargo == "Coordenador" ) {
        coordenador.bonusFinalAno = 1500f
    }
    if ( engenheiroSoftware.cargo == "Engenheiro de Software" ) {
        engenheiroSoftware.bonusFinalAno = 1000f
    }
    if ( estagiario.cargo == "Estagiário" ) {
        estagiario.bonusFinalAno = 500f
    }

    println(gerente.bonusFinalAno)
    println(coordenador.bonusFinalAno)
    println(engenheiroSoftware.bonusFinalAno)
    println(estagiario.bonusFinalAno)

    println(calculaBonus("Gerente"))
    println(calculaBonus("Coordenador"))
    println(calculaBonus("Engenheiro de Software"))
    println(calculaBonus("Estagiário"))

}