package one.digitalinnovation.digionebank

/**
 * Abstract class Funcionario
 *
 * Cria a implementação de uma classe abstrata de Funcionário
 *
 * @property [Pessoa.nome], [Pessoa.cpf], [salario]
 * @constructor inicializa os atributos da classe Funcionario
 * @override [Pessoa]
 */
abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
): Pessoa(nome, cpf) {
    /**
     * Função que calcula o valor do auxílio ao Funcionario
     */
    abstract fun calculoAuxilio()
}