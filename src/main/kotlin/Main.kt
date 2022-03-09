fun main() {
    println()
    println("Bem vindo ao ByteBank")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numeroConta = 1000
    contaAlex.saldo = 100.00

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numeroConta = 2000
    contaFran.saldo = 200.0

    println()

    //imprimir dados da conta deo Alex
    println("Titular: " + contaAlex.titular)
    println("Numero da conta: " +contaAlex.numeroConta)
    println("Saldo: " +contaAlex.saldo)
    testaCondicoesSaldo(contaAlex.saldo)

    println()

    //imprimir dados conta da Fran
    println("Titular: " + contaFran.titular)
    println("Numero da conta: " + contaFran.numeroConta)
    println("Saldo: " + contaFran.saldo)
    testaCondicoesSaldo(contaFran.saldo)
}

class Conta() {
    var titular = ""
    var numeroConta = 0
    var saldo = 0.0
}

fun testaCondicoesSaldo(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta postiva.")
        saldo == 0.0 -> println("Conta neutra.")
        saldo < 0.0 -> println("Conta negativa")
    }
}