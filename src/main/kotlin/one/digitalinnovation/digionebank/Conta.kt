package one.digitalinnovation.digionebank

/**
 * Classe Conta
 *
 * Esta classe instancia objeto conta
 *
 * @property agencia Nome do agencia
 * @property numero Numero da conta
 * @property saldo valor do saldo
 * @constructor cria um construtor com os atributos da classe
 *
 */
class Conta (
    val agencia: String,
    val numero: String,
    val saldo: Double

) {
    /**
     * Função que deposita valores na conta
     * @param valor valor esperado
     */
    fun deposito(valor: Double) {

    }
    /**
     * Função que saca valores da conta
     * @param valor valor esperado
     */
    fun saque(valor: Double) {

    }
}