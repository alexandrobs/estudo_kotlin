package teste_kotlin_fundamental.portaria

class Console {
    fun readInt(msg: String): Int {
        var retorno: Int? = null
        do {
            print(msg)
            val info = readLine()

            if (info != null && info != "") {
                retorno = info.toIntOrNull()

                if (retorno == null) {
                    println("Valor invalido!!")
                }
            }
        } while (retorno == null)
        return 0
    }
}