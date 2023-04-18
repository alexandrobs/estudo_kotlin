package teste_kotlin_fundamental.sobre_parametros

fun main() {

    //sem escrever os nomes dos parametros
    endereco("afranio peixoto", "fortaleza", "ceara", "60452683", 288)

    //testa metodo com valor padrao em um parametro
    enderecoComValorPadrao("afranio peixoto", "fortaleza", "ceara", "60452683")

    //escrevendo os nomes dos parametros
    endereco(rua = "adriano da bola", cidade = "pauoco", estado = "bananal", cep = "99996555", 155)

}

//metodo com muitos parametros e sem valores padroes
fun endereco(rua: String, cidade: String, estado: String, cep: String, num: Int) {

}

//metodo com muitos parametros e com valor padrao
fun enderecoComValorPadrao(rua: String, cidade: String, estado: String, cep: String, num: Int = 0) {

}