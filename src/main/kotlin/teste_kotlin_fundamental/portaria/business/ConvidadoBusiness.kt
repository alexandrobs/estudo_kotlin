package teste_kotlin_fundamental.portaria.business

import teste_kotlin_fundamental.portaria.entity.Convidado

class ConvidadoBusiness {
    fun tipoValido(tipo: String): Boolean = tipo == "comum" || tipo == "premium" || tipo == "luxo"
    fun maiorDeIdade(idade: Int) = idade >= 18
    fun convidadoValido(convite: Convidado) = when (convite.tipo) {
        "comum" -> convite.codigo.startsWith("xt")
        "premium", "luxo" -> convite.codigo.startsWith("xl")
        else -> false
    }
}