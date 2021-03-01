package one.digitalinnovation.digionebank

/**
 * Interface responsável pela autenticação de usuário
 *
 */
interface Logavel {
    /**
     * método que compara senhas
     * @return Boolean
     */
    fun login(): Boolean
}