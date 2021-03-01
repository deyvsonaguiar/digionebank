package one.digitalinnovation.digionebank.testes

/**
 * Classe [TesteFuncionarioGerente] que implementa as operações de [Gerente]
 */

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente("Maria das Neves", "123.365.123-52", 3500.0)

    ImprimeRelatorioFuncionario.imprime(maria)
}