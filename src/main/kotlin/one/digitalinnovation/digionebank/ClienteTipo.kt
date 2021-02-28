package one.digitalinnovation.digionebank

/**
 * @param descricao do tipo String
 * @constructor primario
 * @property [PF], [PJ]
 */
enum class ClienteTipo(val descricao: String) {
    /**
     * @return objeto do tipo enum
     */
    PF("Pessoa Física"),
    PJ("Pessoa Jurídica")
}