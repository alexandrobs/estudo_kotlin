package teste_kotlin_fundamental.portaria.business

import teste_kotlin_fundamental.portaria.entity.Convite

class ConvidadoBusiness {
    fun tipoValido(tipo: String): Boolean = tipo == "comum" || tipo == "premium" || tipo == "luxo"

//    fun codigoValido(codigo: String, tipo: String): Boolean {
//        return if (tipo == "comum" && codigo.startsWith("xt")) {
//            true
//        } else (tipo == "premium" || tipo == "luxo") && codigo.startsWith("xl")
//    }

    fun codigoValido(convite: Convite) = when (convite.tipo) {
        "comum" -> convite.codigo.startsWith("xt")
        "premium", "luxo" -> convite.codigo.startsWith("xl")
        else -> false
    }
}