package one.digitalinnovation.digionebank

/**
 * Abstract class Funcionario
 *
 * Cria a implementação de uma classe abstrata de Funcionário
 *
 * @property [Pessoa.nome], [Pessoa.cpf], [salario]
 * @constructor inicializa os atributos da classe Funcionario
 */
abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
): Pessoa(nome, cpf) {
    /**
     * Função que calcula o valor do auxílio ao Funcionario
     */
    protected abstract fun calculoAuxilio(): Double

    /**
     * Função/method hook que sobrescreve o método toString formatando a saída de dados
     */
    override fun toString(): String = """
        Nome:    $nome
        CPF:     $cpf
        Salário: $salario
        Auxílio: ${calculoAuxilio()}
     
    """.trimIndent()
}