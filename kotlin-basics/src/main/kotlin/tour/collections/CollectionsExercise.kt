package tour.collections

/**
 * Exercise1
 * You have a list of “green” numbers and a list of “red” numbers.
 * Complete the code to print how many numbers there are in total.
 *
 * Exercise2
 * You have a set of protocols supported by your server. A user requests to use a particular protocol.
 * Complete the program to check whether the requested protocol is supported or not
 * (isSupported must be a Boolean value).
 *
 * Exercise3
 * Define a map that relates integer numbers from 1 to 3 to their corresponding spelling.
 * Use this map to spell the given number.
 */

fun main() {
    // Exercise1
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    println("Numbers in total: ${greenNumbers.count() + redNumbers.count()}")

    //Exercise2
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
        println("Support for $requested: $isSupported")

    // Exercise3
    val number2word: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}