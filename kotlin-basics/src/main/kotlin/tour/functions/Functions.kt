package tour.functions

//default
fun sayHello(): String {
    return "hello"
}

// Single-expression function with named arguments and default value
fun greet(name: String = "Everyone") = "Greetings from $name"

// other default params
fun add(one: Int = 0, two: Int = 0): Int {
    return one + two
}


// Functions without return (are of type "Unit")
fun main() {
    println(sayHello())
    println(greet("Marcel"))

    // (optional) default params
    println(add(1, 2))
    println(add(one = 1, two = 2))
    println(add(one = 1)) // two is 0
    println(add(two = 2)) // one is 0
}