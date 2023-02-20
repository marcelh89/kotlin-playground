package conditions

import java.time.DayOfWeek
import java.time.LocalDate

fun demoIf() {
    val now = LocalDate.now()

    // shortened if clause
    val text = if (DayOfWeek.MONDAY == now.dayOfWeek)
        "Today is Monday"
    else
        "It is not Monday"

    println(text)

}