import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {                                // A function that can be suspended and resumed later
    val start = System.currentTimeMillis()

    val urls: List<String> = listOf(
        "https://dummyjson.com/products/1",
        "https://dummyjson.com/products/2",
        "https://dummyjson.com/products/3",
        "https://dummyjson.com/products/4"
    )


    coroutineScope {                                // Create a scope for starting coroutines
        for (i in 1..urls.size) {
            launch {                                // Start 10 concurrent tasks
                //delay(3000L - i * 300)              // Pause their execution
                
                log(start, "Countdown: $i")
            }
        }
    }
    // Execution continues when all coroutines in the scope have finished
    log(start, "Liftoff!")
}

fun log(start: Long, msg: String) {
    println(
        "$msg " +
                "(on ${Thread.currentThread().name}) " +
                "after ${(System.currentTimeMillis() - start) / 1000F}s"
    )
}