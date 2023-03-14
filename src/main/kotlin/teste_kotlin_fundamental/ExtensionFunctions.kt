package teste_kotlin_fundamental

//extension functions
class Testa06 {

}

fun main(){
    val json = """
        {"nome":"Alex", "idade":"33"}
    """.trimIndent()

//    fun isJson(myString: String): Boolean {
//        return kotlin.runCatching {
//            JSONObject(myString)
//            return true
//        }.getOrDefault(false)
//    }

//        fun String.isJson(myString: String): Boolean {
//        return kotlin.runCatching {
//            JSONObject(this)
//            return true
//        }.getOrDefault(false)
//    }

    fun String.lastChar() = get(length -1)

    fun String.firstChar() = get(0)

    val nome: String = "Sofia"

    println(nome.lastChar())
    println(nome.firstChar())

}