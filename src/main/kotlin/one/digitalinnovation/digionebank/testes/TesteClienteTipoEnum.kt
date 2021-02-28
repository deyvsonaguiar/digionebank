package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

/**
 * Classe TesteClienteTipoEnum
 *
 * Classe que implementa o método man e instancia diversas operações de [ClienteTipo]
 *
 */
fun main() {
    //função lambda que instancia um objeto de [ClienteTipo] e itera seu array de elementos
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }
    //funcao lambda que instancia um objeto de [ClienteTipo] e itera seu  atraves do scope function it
    ClienteTipo.values().forEach {
        println(">${it.name} - ${it.descricao}")
    }

    //variável que armazena a instancia de um objeto do tipo [ClienteTipo.PF] e itera seus elementos
    val pf = ClienteTipo.PF
    println(">>${pf.name} - ${pf.descricao}")

    //variável que armazena a instancia de um objeto do tipo [ClienteTipo.PJ] e itera seus elementos
    val pj = ClienteTipo.PJ
    println(">>>${pj.name} - ${pj.descricao}")
}