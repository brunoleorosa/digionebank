package one.digitalinnovationone.digionebank.testes;

import one.digitalinnovationone.digionebank.Funcionario;

class ImprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario:Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}
