package teste_kotlin_fundamental.portaria.control

import teste_kotlin_fundamental.portaria.business.ConvidadoBusiness
import teste_kotlin_fundamental.portaria.entity.Convite

class Portaria {

    private var convidadoBusiness = ConvidadoBusiness()

    init {
        println("Portaria inicializada")
        println(controle())
    }

    private fun controle(): String {
        val idadeCliente = Console.readInt("Qual sua idade? ")

        if (idadeCliente < 18) {
            return "Negado menor de idade"
        }

        val tipoConvite = Console.readString("Qual seu convite? ")
        if (!convidadoBusiness.tipoValido(tipoConvite)) {
            return "Convite invalido"
        }

        val codigo = Console.readString("Qual o codigo convite? ")
        val convite = Convite(tipoConvite,  codigo)
        if (!convidadoBusiness.codigoValido(convite)) {
            return "Codigo invalido"
        }

        return "Welcome!"
    }

    fun portaria() {
        /*print("Qual sua idade? ")
        val idade = readLine()
        if (idade != null && idade != "") {
            if (idade.toInt() < 18){
                println("Negado menor")
                return
            }
        }*/
        print("Qual é o tipo de convite? ")
        var tipoConvite = readLine()
        if (tipoConvite != null && tipoConvite != "") {
            /*tipoConvite = tipoConvite.lowercase()
            //validacao tipo convite
            if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
                println("Negado seu convite")
                return
            }*/
            print("Qual o código convite?")
            var codigo = readLine()
            if (codigo != null && codigo != "") {
                codigo = codigo.lowercase()

                if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                    println("welcome :)")
                } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")
                ) {
                    println("welcome :)")
                } else {
                    println("negado convite!!")
                }
            }
        }
    }
}