package one.digitalinnovation.digionebank

/**
 * Classe Banco
 *
 * Esta classe instancia objeto banco
 *
 * @property nome Nome do banco
 * @property numero Numero do banco
 * @constructor cria um construtor com os atributos da classe
 *
 */

class Banco (
    val nome: String,
    val numero: Int

) {
    /**
     * Função que mostra informações de bancos
     * @return retorna o nome e o numero de banco
     */
    fun info() = "$nome - $numero"}