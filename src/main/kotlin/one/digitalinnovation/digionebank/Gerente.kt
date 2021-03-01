package one.digitalinnovation.digionebank

/**
 * Classe [Gerente]
 * Implementa o objeto do tipo especializado Analista
 * @property [Pessoa.nome], [Pessoa.cpf], [salario]
 * @constructor inicializa os atributos da classe Funcionario
 */
class Gerente(
    nome: String,
    cpf: String,
    salario: Double): Funcionario(nome, cpf, salario) {
    //método a ser implementado para calcular o auxílio de funcionário
    override fun calculoAuxilio(): Double = salario * 0.4
}