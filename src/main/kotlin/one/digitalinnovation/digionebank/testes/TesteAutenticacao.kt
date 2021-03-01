package one.digitalinnovation.digionebank.testes

/**
 * Classe [TesteAutenticacao] que implementa o método que autentica usuário
 */

import one.digitalinnovation.digionebank.Logavel

class TesteAutenticacao {
    /**
     * Método que verifica e compara a senha através do método da interface
     * @param [logavel] que itera da interface e implementa o método login
     */
    fun autentica(logavel: Logavel) = println(logavel.login())
}