package teste_kotlin_fundamental.estudos_diversos_por_conteudo

fun main() {

    /*
    O break funciona para os laços for, while, do-while
    qualquer desses laços
     */

    var i = 0
    while (i < 10000000000) {

        if (i == 50) {
            break
        }

        print("$i ")
        i++
    }

    println()

    //usando o continue ele ignora o que embaixo dele e volta para o laço
    var i2 = 0
    while (i2 < 1000) {

        if (i2 < 50) {
            i2++
            continue
        }

        print("$i2 ")
        i2++
    }

    println()

    var str = "kskskkdkkddoekofoenvjfvnjfa90192092012910290129kdnjskdnkjdnkjsndjs"

    while (str.contains("a")){
        print("tem a sim senhor")
        break
    }
}