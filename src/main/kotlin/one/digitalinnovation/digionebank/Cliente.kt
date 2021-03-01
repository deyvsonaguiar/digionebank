package one.digitalinnovation.digionebank

/**
 * Classe [Cliente]
 * Implementa o objeto do tipo especializado Cliente
 * @property [Pessoa.nome], [Pessoa.cpf], [clienteTipo], [senha]
 * @constructor inicializa os atributos da classe [Pessoa]
 */

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
): Pessoa(nome, cpf), Logavel {
    //sobrescrevendo método login para autenticar usuário específico
    override fun login(): Boolean = "123456" == senha

    //sobrescreve método para formatar a saída de dados do Cliente
    override fun toString(): String = """
        Nome:   $nome
        CPF:    $cpf
        Tipo:   ${clienteTipo.descricao}
    """.trimIndent()
}