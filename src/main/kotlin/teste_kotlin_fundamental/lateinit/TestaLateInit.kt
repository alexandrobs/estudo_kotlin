package teste_kotlin_fundamental.lateinit

class Receita {
    var instrucoes: String? = null
    //ou
    //lateinit tem que ser var, n pode ser val, pq ela tem que ser atribuida valor depois
    //outra coisa e que ela n vai existir na memoria enquanto ela n for inicializada, podemos ate usar ela,
    //mas ela n ira existir na memoria, so sao alocadas na memoria quando inicializadas
    lateinit var instrucoes2: String

    fun gerarReceita() {
        instrucoes2 = "Lave as maos"
    }

    fun imprimeReceita() {
        if (this::instrucoes2.isInitialized) {
            instrucoes2 = "lave as maos 2"
        }
    }
}

fun main() {

    var r: Receita = Receita()
    r.instrucoes?.length

    r.gerarReceita()
    r.instrucoes2

    r.imprimeReceita()
}