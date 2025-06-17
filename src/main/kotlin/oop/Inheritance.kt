package org.example.oop

open class BaseCoffeeMachine( // writing open makes it inheritable
    private val price: Double,
    private val color : String
) {
    fun makeCoffee() {
        println("Direct from Base Coffee Machine - here's you chai")
    }
}

//Inheriting the Base to premium

class PremiumCoffeeMachine(
    private val price: Double,
    private val color: String
) : BaseCoffeeMachine(price, color) {

    // to access the functions from the parent the function should not be private
    fun makeTea() {
        println("Tea Khatam sirf Coffee bachi hai")
    }
}


fun main() {
    val coffeeMachine = PremiumCoffeeMachine(price = 10000.0, color = "BROWN")
    coffeeMachine.makeCoffee()
    coffeeMachine.makeTea()
}