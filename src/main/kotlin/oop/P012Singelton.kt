package org.example.oop


// In Java
class Manager private  constructor() {
    companion object {
        private var instance: Manager? = null
        operator fun invoke() = synchronized(this)  {
            if (instance == null )
                instance = Manager()
            instance
        }
    }
}


// In kotlin
object ManagerSingeltonImplementationInKotlin { // - Singelton Class
    init {
        println("Manager Object Initialized")
    }
}

object M

fun main() {
    println("----------------------------------JAVA-------------------------------------------")
    println(Manager())
    println(Manager.invoke())

    println("----------------------------------KOTLIN-------------------------------------------")
    println(ManagerSingeltonImplementationInKotlin)
}