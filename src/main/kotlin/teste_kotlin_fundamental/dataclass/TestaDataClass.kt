package teste_kotlin_fundamental.dataclass

fun main() {

    //objeto(f1) -> endereco de memoria
    //objeto(f2) -> endereco de memoria

    val f1: Forma = Forma(10, 8)
    val f2: Forma = Forma(10, 8)
    println("class")
    println(f1.equals(f2))
    println(f1.hashCode())
    println(f1.toString())
    println("-------------")
    println(f2.hashCode())
    println(f2.toString())

    println("************")
    println("data class")
    val f3: FormaData = FormaData(10, 8)
    val f4: FormaData = FormaData(10, 8)
    var f5: FormaData
    println(f3.equals(f4))
    println(f3.hashCode())
    println(f3.toString())
    println("-------------")
    println(f4.hashCode())
    println(f4.toString())

    println("************")

    //copy e outro metodo que ja vem implementado no data class, class n tem
    f5 = f3.copy(50)
    println(f5.toString())

}

class Forma(val a: Int, val b: Int) {
    override fun equals(other: Any?): Boolean {
        return if(other is Forma) {
            (other.a == this.a && other.b == this.b)
        } else {
            false
        }
    }

    override fun toString(): String {
        return "${this.a} + ${this.b}"
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}

data class FormaData(val a: Int, val b: Int)
//data class ja implementa equals comparando valores e n enderecos de memoria como na class
//na class temos que implementar esses metodos, equals, toString e hashCode
//hashcode ja vem trazendo baseado nos valores dos atributos, diferente do class

//outra utilidade para data class, facilitar passando ela no metodo ao inves de passar um monte de parametros
data class Endereco(val rua: String, val cep: String, val city: String)
fun endereco(e: Endereco) {}