package teste_kotlin_fundamental.polimorfismo

//usar interface ou abstract class
interface Funcionario {
    var salario: Float
    fun bonus(): Float
}

class Gerente(override var salario: Float): Funcionario {
    override fun bonus(): Float {
        return salario * 0.5f
    }
}

class Analista(override var salario: Float): Funcionario {
    override fun bonus(): Float {
        return salario * 0.3f
    }
}

fun mostraBonus(g: Gerente) {
    println(g.bonus())
}

fun mostraBonus(a: Analista) {
    println(a.bonus())
}

fun mostraBonus(f: Funcionario) {

}

fun main() {
    mostraBonus(Gerente(5000f))
    mostraBonus(Analista(4000f))

    mostraBonus(Gerente(5000f))
    mostraBonus(Analista(4000f))

    try {
        //exemplo de polimorfismo no caso das exceptions
    } catch (ex: Exception) {

    } catch (ex: NullPointerException) {

    } catch (ex: ArithmeticException) {

    }
}
