package one.digitalinnovationone.digionebank.testes

import one.digitalinnovationone.digionebank.Banco

fun main(){
    val digiOneBank = Banco("DigiOne", 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)
}