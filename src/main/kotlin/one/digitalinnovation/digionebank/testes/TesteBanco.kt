package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

/**
 * Classe TesteBanco
 *
 * Classe que instancia objeto tipo [Banco]
 */

fun main() {
    //armazena na variável uma nova instancia da classe herdada Banco
    val digiOneBank = Banco(nome = "Digione", numero = 5)

    //mostra as informações
    println(digiOneBank.nome)
    println(digiOneBank.numero)

    //aplicão quebrou Erro "Kotlin: Unresolved reference: copy"
    //val banco2 = digiOneBank.copy(nome="banco2")

    //println(banco2.info())

}