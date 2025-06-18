package org.example.oop

class ArrayUtils<T> (private val array: Array<T>) {
    fun findElement(element: T,  foundElement: (index: Int, element: T?)-> Unit ) {
        for( i in array.indices) {
            if (array[i] == element) {
                foundElement(i, array[i])
                return
            }
        }
        foundElement(-1, null)
    }
}

fun main() {
    val arrayUtil = ArrayUtils<Int>(arrayOf(1,2,3,4,5))
    println(arrayUtil)
}