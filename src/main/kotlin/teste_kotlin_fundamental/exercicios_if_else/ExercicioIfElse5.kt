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

fun portaria() {
    print("qual sua idade?")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("negado, menores nao sao permitidos")
            return
        }
    }

    print("qual tipo de convite?")
    var tipoConvite = readLine()

    if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo") {
        print("qual o codigo do convite?")
        var codigo = readLine()

        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()
            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                println("Welcome :)")
            } else if (tipoConvite == "premium" || tipoConvite == "luxo"
                && codigo.startsWith("xl")
            ) {
                println("Welcome :)")
            } else {
                println("negado. convite invalido")
            }
        }
    } else {
        println("negado. convite invalido")
    }
}

fun main() {

    println("Digite sua idade: ")
    var idade = readLine()?.toInt()

    if (idade != null) {
        if (idade >= 18) {
            println("Idade Ok")

            var convites = setOf("comum", "premium", "luxo")

            println("Digite seu convite: ")
            var conviteApresentado = readLine()

            if (convites.contains(conviteApresentado)) {
                println("Convite OK")

                var codigoConvite = setOf("XL", "XT")

                println("Digite o codigo do convite: ")
                var codigoConviteEntrada = readLine()

                if (codigoConvite.contains(codigoConviteEntrada)) {
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

    portaria()
}