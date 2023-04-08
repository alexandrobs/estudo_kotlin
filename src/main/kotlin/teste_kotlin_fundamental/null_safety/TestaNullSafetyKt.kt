package teste_kotlin_fundamental.null_safety

fun main() {
    //exemplo de NullSafety
    var s: String? = null
    println(s)

    //buscando outra exception

    //println(num1)
    //pega a exception e coloca num catch
    try {
        //var num1 = 10/0
        //println(num1)
        println(s!!.length)
    } catch (e: java.lang.ArithmeticException) {
        println("Nao se pode dividir por 0 $e")
    } catch (e: java.lang.NullPointerException) {
        println("variavel nula $e")
        //esse finally e opcional
    } catch (e: java.lang.Exception) {
        println("Generica")
    } finally {
        println("Finally")
    }

    try {
        //assumindo que não é nulo
        println(s!!.length)
    } catch (e: NullPointerException) {
        println("variavel nula $e")
    }

}