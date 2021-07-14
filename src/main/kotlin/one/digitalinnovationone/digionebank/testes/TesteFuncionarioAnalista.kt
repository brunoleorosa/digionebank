package one.digitalinnovationone.digionebank.testes

import one.digitalinnovationone.digionebank.Analista

fun main(){

    val jose = Analista(nome = "Jose", cpf = "32132132132", salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(jose)
}