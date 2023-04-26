package teste_kotlin_fundamental.classes_atributos_metodos

class Pessoa(val anoNascimento: Int, var nome: String) {

    //aqui estamos criando um construtor secundario, mas pra isso precisamos passar o construtor primario
    constructor(anoNascimento: Int, nome: String, documento: String): this(anoNascimento, nome)

    //essa variavel eu consigo acessar pq ela esta dentro da classe
    var olhos: String = " "
    var altura: Int = 0

    fun dormir() {

    }

    fun acordar() {
        //variavel dentro da funcao n e visivel fora dela, isso e, ela e visivel apenas no escopo da funcao
        var horasDormidas = 4
    }
}

//toda classe tem um construtor primário por baixo dos panos que ira ser chamado quando instaciada a classe
class Vazia

//podemos fechar o contrutor, mas não poderemos instanciar a classe que tiver um construtor privado
class Vazia2 private constructor()

class PessoaDefault(val anoNascimento: Int = 2000)

fun main() {
    //classe - comportamentos e atributos

    //classe instancia objetos
    var pessoa: Pessoa = Pessoa(1986, "Fulano")

    var pessoa2: Pessoa = Pessoa(2016, "Maria", "1234567878989")

    var pessoaDefault: PessoaDefault = PessoaDefault()

    println(pessoa.anoNascimento)
    println(pessoa.nome)
    println(pessoa.acordar())
    println(pessoa.dormir())
    pessoa.olhos = "Azul"
    pessoa.altura = 200
    println(pessoa.olhos)
    println(pessoa.altura)

    println(pessoaDefault.anoNascimento)

    Vazia()

    //isso da erro, pq n da pra instanciar essa classe por seu contrutor ser privado
    //Vazia2()

    //this - se refere ao objeto, a instancia da classe, ao escopo dela

}