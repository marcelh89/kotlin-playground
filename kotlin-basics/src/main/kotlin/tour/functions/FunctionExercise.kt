package tour.functions

import kotlin.math.PI
import kotlin.math.pow

/*
 * Exercise 1
 * Write a function called circleArea that takes the radius of a circle in integer format as a parameter and outputs the area of that circle.
 */
fun circleArea(radius: Int): Double {
    return PI * radius.toDouble().pow(2)
//    return PI * radius * radius
}


/*
 * Exercise 2
 * Rewrite the circleArea function from the previous exercise as a single-expression function.
 */
fun circleAreaFunctional(radius: Int): Double = PI * radius.toDouble().pow(2)


/*
 * Exercise 3
 * You have a function that translates a time interval given in hours, minutes, and seconds into seconds.
 * In most cases, you need to pass only one or two function parameters while the rest are equal to 0.
 * Improve the function and the code that calls it by using default parameter values and named arguments
 * so that the code is easier to read.
 */
fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
    ((hours * 60) + minutes) * 60 + seconds

fun main() {
    println(circleArea(2))
    println(circleAreaFunctional(2))

    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes = 1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(hours = 1, seconds =  1))
}