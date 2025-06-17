package org.example.oop

fun main() {
    var b1 = Box()

    println(b1.length)
    println("----------------------------------------")
    b1.fillContents()

    println(b1.volume)
    println("--------------------------------------------------")
    b1.boxName = "Overriding name .......... \n new name -> Mr. Box"
    println(b1.boxName)
    println()
}

class Box {

    var length: Int = 10
    var width: Int = 100
    var height: Int = 50

    // you normally don't write getters and setters in kotlin because it is handled

    val volume
        get() = length * width * height

    var boxName: String = "Box Name"
        set(value) {
            if (value.length < 3) println("Name cannot be less than 3 characters")
            else field = value
        }


    fun fillContents() {
        println("Box is Filled")
    }

    fun open() {
        println("Box opened")
    }

}