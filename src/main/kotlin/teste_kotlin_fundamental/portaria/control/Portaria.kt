package teste_kotlin_fundamental.portaria.control

import teste_kotlin_fundamental.portaria.business.ConvidadoBusiness
import teste_kotlin_fundamental.portaria.entity.Convidado

class Portaria {

    private var convidadoBusiness = ConvidadoBusiness()

    init {
        println("Portaria inicializada")
        println(controle())
    }

    private fun controle(): String {
        val idade = Console.readInt("Qual sua idade? ")
        val convidado = Convidado(idade = idade)

        if (!convidadoBusiness.maiorDeIdade(convidado.idade)) {
            return "Negado menor de idade"
        }

        convidado.tipo = Console.readString("Qual seu convite? ")
        if (!convidadoBusiness.tipoValido(convidado.tipo)) {
            return "Convite invalido"
        }

        convidado.codigo = Console.readString("Qual o codigo convite? ")
        if (!convidadoBusiness.convidadoValido(convidado)) {
            return "Codigo invalido"
        }

        return "Welcome!"
    }
}