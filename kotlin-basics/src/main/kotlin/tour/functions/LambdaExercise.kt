package tour.functions

/*
 * Exercise 1
 * You have a list of actions supported by a web service, a common prefix for all requests,
 * and an ID of a particular resource. To request an action title over the resource with ID: 5,
 * you need to create the following URL: https://example.com/book-info/5/title.
 * Use a lambda expression to create a list of URLs from the list of actions.
 */

/*
 * Exercise 2
 * Write a function that takes an Int value and an action (a function with type () ->
 * Unit) which then repeats the action the given number of times. Then use this function to print “Hello” 5 times.
 */
fun repeatN(n: Int, action: () -> Unit) {
    // Write your code here
    for (i in 1..n) {
        action()
    }
}

fun main() {
    //Exercise 1
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { action -> "$prefix/$id/$action" }
    println(urls)

    //Exercise 2
    repeatN(5) { print("Hello") } // using Trailing lambda

}

