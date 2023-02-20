package exceptions

import java.io.IOException

fun throwException() {
    throw IOException("Kotlin has no checked Exceptions. In Java IOException is checked.")
}