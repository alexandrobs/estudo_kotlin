package teste_kotlin_fundamental.sobre_parametros

fun main() {

    //sem escrever os nomes dos parametros
    endereco("afranio peixoto", "fortaleza", "ceara", "60452683", 288)

    //escrevendo os nomes dos parametros
    endereco(rua = "adriano da bola", cidade = "pauoco", estado = "bananal", cep = "99996555", 155)

    //testa metodo sem passar um valor por poder passar sem ele, já que há um valor padrao nesse parametro
    enderecoComValorPadrao("afranio peixoto", "fortaleza", "ceara", "60452683")

}

//metodo com muitos parametros e sem valores padroes
fun endereco(rua: String, cidade: String, estado: String, cep: String, num: Int) {

}

//metodo com muitos parametros e com valor padrao
fun enderecoComValorPadrao(rua: String, cidade: String, estado: String, cep: String, num: Int = 0) {

}