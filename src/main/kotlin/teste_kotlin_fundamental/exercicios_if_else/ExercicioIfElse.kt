package teste_kotlin_fundamental.exercicios_if_else

/*
1. Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final do ano.
Os bônus são classificados por cargo.
a. Gerentes recebem R$ 2.000,00
b. Coordenadores recebem R$ 1.500,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500.00
*/

fun main(){

    data class Empregado (
        var cargo: String,
        var bonusFinalAno: Double)

    val gerente = Empregado("Gerente", 0.00)
    val coordenador = Empregado("Coordenador", 0.00)
    val engenheiroSoftware = Empregado("Engenheiro de Software", 0.00)
    val estagiario = Empregado("Estagiário", 0.00)

    if(  gerente.cargo == "Gerente" ) {
        gerente.bonusFinalAno = 2.000
    }
    if (  coordenador.cargo == "Coordenador" ) {
        coordenador.bonusFinalAno = 1.500
    }
    if ( engenheiroSoftware.cargo == "Engenheiro de Software" ) {
        engenheiroSoftware.bonusFinalAno = 1.000
    }
    if ( estagiario.cargo == "Estagiário" ) {
        estagiario.bonusFinalAno = 500.0
    }

    println(gerente.bonusFinalAno)
    println(coordenador.bonusFinalAno)
    println(engenheiroSoftware.bonusFinalAno)
    println(estagiario.bonusFinalAno)

}