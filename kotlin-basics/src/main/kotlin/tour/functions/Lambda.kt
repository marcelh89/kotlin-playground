package tour.functions

fun main() {

    // inline and Invoke separately
    println({ string: String -> string.uppercase() }("hello"))

    // assign lambda to variable
    val upperCaseString = { string: String -> string.uppercase() }
    println(upperCaseString("test"))

    // Trailing lambdas
    println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // without trailing lambda
    println(listOf(1, 2, 3).fold(0) { x, item -> x + item }) // with trailing lambda

}