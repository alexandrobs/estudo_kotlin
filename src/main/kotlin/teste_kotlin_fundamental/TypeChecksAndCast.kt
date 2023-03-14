package teste_kotlin_fundamental

//type checks and cast
class Testa08 {
}

fun main(){
    fun demo(x: Any) {
        if (x is String){
            print(x.length)
        }
    }

    println(demo(1))
    println(demo("ola"))
}