package teste_kotlin_fundamental

//1. Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas, minutos e
//segundos. Saída desejada:
//2 anos equivalem a:
//24 meses
//730 dias
//17520 horas
//1051200 minutos
//63072000 segundos

fun main(){

    transformaData(98)
}

fun transformaData(anos: Int) {
    var resultadoMeses = anos * 12
    println("$resultadoMeses meses")

    var resultadoDias = anos * 365
    println("$resultadoDias dias")

    var resultadoHoras = anos * 8760
    println("$resultadoHoras horas")

    var resultadoMinutos = anos * 525600
    println("$resultadoMinutos minutos")

    var resultadoSegundos = anos * 31536000
    println("$resultadoSegundos segundos")

}