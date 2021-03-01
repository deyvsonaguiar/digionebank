package one.digitalinnovation.digionebank.testes

/**
 * Classe [TesteFuncionarioAnalista] que implementa as operações de [Analista]
 */
import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista("João Pedro", "123.123.123-12", 2000.0)

    ImprimeRelatorioFuncionario.imprime(joao)
}