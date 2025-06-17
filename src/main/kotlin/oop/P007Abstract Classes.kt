package org.example.oop

import java.time.Duration

abstract class AbstractBaseCoffeeMachine(
    private val price: Double,
    private val color: String
) {
    abstract val brand: String

    abstract fun makeCoffee(type: String): String //ERROR - function without body must be abstract

    fun machineInfo(): String {
        return "Coffee Machine Details \n " +
                "Price: $price\n" +
                "Color: $color"
    }
}


class AbstractPremiumCoffeeMachine(price: Double, color: String) : AbstractBaseCoffeeMachine(price, color) {

    override val brand: String
        get() = "Brand X"

    override fun makeCoffee(type: String): String {
        return "your $type is ready"
    }
}


class AbstractSlowCoffeeMachine(price: Double, color: String) : AbstractBaseCoffeeMachine(price, color) {
    override val brand: String
        get() = "Sasti Coffee Machine"

    override fun makeCoffee(type: String): String {
        return "your $type is ready"
    }

}

fun main() {
    val coffeeMachine = AbstractPremiumCoffeeMachine(1000.09, "RED")
    val info = coffeeMachine.machineInfo()

    val coffee = coffeeMachine.makeCoffee("ELAICHI CHAI")
    println(coffee)
    println(info)

    val sastiCoffeeMachine = AbstractSlowCoffeeMachine(10.0, "Chai color")
    val chaiKaChaska = sastiCoffeeMachine.makeCoffee("10 ki Chai")
    println(chaiKaChaska)
}