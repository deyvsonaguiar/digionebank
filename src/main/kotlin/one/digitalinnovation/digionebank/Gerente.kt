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
    salario: Double,
    val senha: String): Funcionario(nome, cpf, salario), Logavel {
    //método a ser implementado para calcular o auxílio de funcionário
    override fun calculoAuxilio(): Double = salario * 0.4

    //sobrescrevendo método login para autenticar usuário específico
    override fun login(): Boolean = "senha123" == senha
}