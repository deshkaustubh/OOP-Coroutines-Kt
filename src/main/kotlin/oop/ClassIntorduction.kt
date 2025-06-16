package oop


fun main() {
    val mustang = Car( "mustang", "petrol", 100)
    val beetle = Car("beetle", "diesel", 200 )

    println(mustang.name)
    println(mustang.type)
    println(beetle.name)

    println(beetle.driveCar())
    println(beetle.applyBreaks())
}

class Car (val name: String, val type: String, var kmRan: Int) {
    fun driveCar() {
        println("$name Car is Driving")
    }
    fun applyBreaks() {
        println("The $type powered $name car applied brakes after $kmRan kilometers")
    }
}

