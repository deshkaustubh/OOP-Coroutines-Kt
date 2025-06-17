package org.example.oop

fun main() {
    val box1 = BoxWithPrimaryConstructor(10)
    val box2 = BoxWithPrimaryConstructor()
}

class BoxWithPrimaryConstructor(
    var length: Int ,
    var width: Int = 100,
    var height: Int = 50
) {

    init {
        // for the primary constructor
        println("Init Block called")
    }


    // secondary constructor
    constructor() : this(0, 0, 0) {
        println("secondary constructor got called")
    }

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
