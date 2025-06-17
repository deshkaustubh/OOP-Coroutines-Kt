package org.example.oop

/*
4 types ->
they are -
    Public - Default , cab be accessed everywhere,
    private - Available only inside the containing file or class
    protected - Same as private but available inside subclasses or child classes

         internal -> Available everywhere inside the same module
 */


class ConstructorSyntax  private constructor(
    var integer : Int,
    var strings : String
) {
    val numbersAre = integer
}

class IfNoVisibilityModifier (
    var integer : Int,
    var strings : String
) {
    val numbersAre = integer
}
