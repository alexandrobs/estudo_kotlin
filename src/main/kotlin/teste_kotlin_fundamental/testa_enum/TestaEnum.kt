package teste_kotlin_fundamental.testa_enum

enum class Prioridade {
    Baixo, Medio, Alto
}

enum class Prioridade2(val value: Int) {
    Baixo(1) {
        override fun toString(): String {
            return "Prioridade baixa: $value"
        }
             },
    Medio(5) {
        override fun toString(): String {
            return "Prioridade baixa: $value"
        }
             },
    Alto(15) {
        override fun toString(): String {
            return "Prioridade baixa: $value"
        }
    }
}

enum class AnimalEnum {
    Cachorro, Gato, Cavalo, Vaca, Tartaruga
}

fun x(p: Prioridade) {

}

fun y(a: AnimalEnum) {

}

fun main() {
    x(Prioridade.Baixo)

    for(p in Prioridade.values()) {
        println(p)
    }

    for(p in Prioridade2.values()) {
        println(p)
    }

    y(AnimalEnum.Cachorro)

}