package org.example.oop

import java.util.*
import kotlin.reflect.KProperty

class Student {
//    var firstName: String? = null
//        set(value) {
//            if (value != null && value.length > 5) {
//                field = value.trim().uppercase(Locale.getDefault())
//            }
//        }
    var firstName: String? by NameDelegate()
    var lastName: String? by NameDelegate()
//    var lastName: String? = null
//        set(value) {
//            if (value != null && value.length > 5) {
//                field = value.trim().uppercase(Locale.getDefault())
//            }
//        }

    override fun toString(): String {
        return "$firstName $lastName"
    }
}

// in the above class the condition for firstname and lastname is same so we can make use of delegation properties in such a case

class NameDelegate{
    var formattedValue : String?  = null

    operator fun setValue (
        thisRef: Any?,
        property: KProperty<*>,
        value: String?
    ) {
        if (value != null && value.length > 5) {
            formattedValue = value.trim().uppercase(Locale.getDefault())
        }
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String? {
        return formattedValue
    }
}

fun main() {
    val student = Student()
    student.firstName = "Hello"
    student.lastName = "World"
    println(student)
}