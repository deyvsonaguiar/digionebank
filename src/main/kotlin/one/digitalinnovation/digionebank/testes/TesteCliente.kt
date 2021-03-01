package one.digitalinnovation.digionebank.testes

/**
 * Classe [TesteCliente] que implementa as operações de [Cliente]
 */
import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente("José Laurentino", "123.365.567-89", ClienteTipo.PF, "123456")

    //imprime os dados do cliente
    println(jose)
    //autentica e verifica as senhas
    TesteAutenticacao().autentica(jose)
}