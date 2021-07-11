package one.digitalinnovationone.digionebank

class Pessoa {
    var nome:String = "Bruno"
    var cpf:String = "123.123.123-12"
    private set

    constructor()

    fun infoPessoa() = "Nome: $nome - CPF: $cpf"
}

fun main(){
    val bruno = Pessoa()

    println(bruno.infoPessoa())
}