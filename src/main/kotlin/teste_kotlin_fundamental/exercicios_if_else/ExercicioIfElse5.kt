package teste_kotlin_fundamental.exercicios_if_else

/*
4. Escreva um programa para ser usado na portaria de um evento
a. Peça a idade. Menores de idade não são permitidos. Mensagem:
"Negado. Menores de idade não são permitidos.".
b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo.
Negar a entrada caso não seja nenhum destes. Mensagem:
"Negado. Convite inválido.".
c. Peça o código do convite. Convites premium e luxo começam com "XL".
Convites comuns começam com "XT".
Caso o código não esteja nos padrões, negar a entrada. Mensagem:
"Negado. Convite inválido.".
d. Caso todos os critérios sejam satisfeitos, exibir "Welcome :)".
 */


fun main() {

    println("Digite sua idade: ")
    var idade = readLine()?.toInt()

    if (idade != null) {
        if (idade >= 18){
            println("Idade Ok")

            var convites = setOf("comum", "premium", "luxo")

            println("Digite seu convite: ")
            var conviteApresentado = readLine()

            if (convites.contains(conviteApresentado)){
                println("Convite OK")

                var codigoConvite = setOf("XL", "XT")

                println("Digite o codigo do convite: ")
                var codigoConviteEntrada = readLine()

                if(codigoConvite.contains(codigoConviteEntrada)){
                    println("Codigo OK")
                    println("WELCOME")

                } else {
                    println("Negado. Convite invalido.")
                }

            } else {
                println("Negado. Convite invalido.")
            }

        } else {
            println("Negado. Menores de idade nao sao permitidos.")
        }
    }
}