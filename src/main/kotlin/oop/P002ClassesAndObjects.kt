package org.example.oop

fun main() {
    var i  = 20
    println(i.plus(30))
    println(i.toFloat())

    val P1 = Person("A", 20)
    val P2 = Person("B", 14)

    println(P1.canVote())
    println(P2.canVote())
}

// classes can be used to crate your own data type like car or account

class Person(val name: String, var age: Int) { // properties
    //methods
    fun canVote(): Boolean {
        return age > 18
    }
}