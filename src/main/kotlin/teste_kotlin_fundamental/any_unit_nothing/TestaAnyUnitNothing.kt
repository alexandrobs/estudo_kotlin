package teste_kotlin_fundamental.any_unit_nothing

fun main() {
    // Any
    valores(false)
    valores("oi")
    valores(1)

    //Unit
    valores2("oi")

    //Nothing
    valores3(1)
    //uso do nothing, vc esta desenvolvendo um sistema mas ainda n tem esses metodos implementados, cria ele retornando
    //Nothing pra depois voltar e implementar ele, como os save e update abaixo, mas pelo jeito ele só lança a primeira
    //exception, depois dela ele para a execução
    save()
    update()
}

fun valores(value: Any) {
    //Any pode assumir qualquer valor
}

fun valores2(txt: String): Unit {
    //Unit diz que a função não tem retorno,
    // mas não precisa colocar o kotlin quando vc não explicita um ele já assume isso
    println("$txt ")
}

fun valores3(numero: Int): Nothing {
    //Nothing, usado para retornar uma exceção
    TODO("Nao implementado")
}

fun save(): Nothing {
    TODO("esse metodo ainda nao foi implementado, mas ele ira salvar")
}

fun update(): Nothing {
    TODO("esse metodo ainda nao foi implementado, mas ele ira fazer o update dos dados")
}



