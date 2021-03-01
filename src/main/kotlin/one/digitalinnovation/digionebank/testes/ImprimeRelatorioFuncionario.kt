package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario

/**
 * Classe [ImprimeRelatorioFuncionario]
 *
 * Esta classe irá imprimir os dados do funcionário
 */
class ImprimeRelatorioFuncionario {
    //método que itera um objeto como classe e não como instância
    companion object{
        /**
         * Função que faz o print dos dados de funcionário devidamente formatados com @override [toString]
         * @param [funcionario]
         */
        fun imprime(funcionario: Funcionario) {
            println(funcionario.toString())
        }
    }
}