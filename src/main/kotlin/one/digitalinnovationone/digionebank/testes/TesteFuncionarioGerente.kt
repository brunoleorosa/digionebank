package one.digitalinnovationone.digionebank.testes

import one.digitalinnovationone.digionebank.Gerente

fun main(){

    val maria = Gerente(nome = "Maria", cpf = "32132132132", salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}