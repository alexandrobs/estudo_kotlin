package teste_kotlin_fundamental.classes_atributos_metodos

class Pessoa(val anoNascimento: Int, var nome: String) {

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
class PessoaDefault(val anoNascimento: Int = 2000)

fun main() {
    //classe - comportamentos e atributos

    //classe instancia objetos
    var pessoa: Pessoa = Pessoa(1986, "Fulano")

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


}