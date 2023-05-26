package teste_kotlin_fundamental.portaria.business

class ConviteBusiness {
    fun tipoValido(tipo: String): Boolean = tipo == "comum" || tipo == "premium" || tipo == "luxo"

    fun codigoValido(codigo: String, tipo: String): Boolean {
        return if (tipo == "comum" && codigo.startsWith("xt")) {
            true
        } else (tipo == "premium" || tipo == "luxo") && codigo.startsWith("xl")
    }
}