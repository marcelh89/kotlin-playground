package tour.controlflow

/**
 * non-local return directly to the caller of foo()
 */
fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // non-local return directly to the caller of foo()
        println(it)
    }
    println("this point is unreachable")
}

/**
 * define a jumpmark for forEach and return to jumpmark
 */
fun foo2() {
    listOf(1, 2, 3, 4, 5).forEach lit@ {
        if (it == 3) return@lit // local return to the caller of the lambda - the forEach loop
        println(it)
    }
    println("this point is unreachable")
}

/**
 * use forEach jumpmark to jump to
 */
fun foo3() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // local return to the caller of the lambda - the forEach loop
        println(it)
    }
    println("this point is unreachable")
}

fun main() {
    foo()
    println("---")
    foo2()
    println("---")
    foo3()
}

