package teste_kotlin_fundamental.portaria

class Portaria {

    private val console = Console()

    fun controle(){
        val idade = console.readInt("Qual sua idade? ")
        if (idade < 18){
            println("Negado menor de idade")
        }
    }

    fun portaria() {
        print("Qual sua idade? ")
        val idade = readLine()
        if (idade != null && idade != "") {
            if (idade.toInt() < 18){
                println("Negado menor")
                return
            }
        }
        print("Qual é o tipo de convite? ")
        var tipoConvite = readLine()
        if (tipoConvite != null && tipoConvite != "") {
            tipoConvite = tipoConvite.lowercase()
            //validacao tipo convite
            if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
                println("Negado seu convite")
                return
            }
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