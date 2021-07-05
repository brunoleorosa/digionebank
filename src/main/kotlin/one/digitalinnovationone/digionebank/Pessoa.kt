package one.digitalinnovationone.digionebank

class Pessoa {
    var nome:String = "Bruno"
    var cpf:String = "123.123.123-12"
    private set
}

fun main(){
    val bruno = Pessoa()

    println(bruno.nome)
    println(bruno.cpf)
}