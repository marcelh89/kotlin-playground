package tour.controlflow


/**
 * Exercise 1
 * Using a when expression, update the following program so that when you input the names
 * of GameBoy buttons, the actions are printed to output.
 *
 * Exercise 2
 * You have a program that counts pizza slices until there’s a whole pizza with 8 slices.
 * Refactor this program in two ways:
 *
 * Exercise 3
 * Write a program that simulates the Fizz buzz game. Your task is to print numbers from 1 to 100 incrementally,
 * replacing any number divisible by three with the word "fizz", and any number divisible by five with the word "buzz".
 * Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz".
 *
 * Exercise 4
 * You have a list of words. Use for and if to print only the words that start with the letter l.
 */
fun main() {

    // Exercise 1
    val button = "A"
    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )

    // Exercise 2
    var pizzaSlices = 0
    // Start refactoring here
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
    println("---")

    // refactored with while
    var pizzaSlicesRefactored = 0
    while (pizzaSlicesRefactored < 8) {
        pizzaSlicesRefactored++
        if (pizzaSlicesRefactored == 8) println("There are $pizzaSlicesRefactored slices of pizza. Hooray! We have a whole pizza! :D")
        else println("There's only $pizzaSlicesRefactored slice/s of pizza :(")
    }
    println("---")


    // refactored with do while
    var pizzaSlicesRefactored2 = 0
    do {
        pizzaSlicesRefactored2++
        if (pizzaSlicesRefactored2 == 8) println("There are $pizzaSlicesRefactored2 slices of pizza. Hooray! We have a whole pizza! :D")
        else println("There's only $pizzaSlicesRefactored2 slice/s of pizza :(")
    } while (pizzaSlicesRefactored2 < 8)


    // Exercise 3
    val numbersFrom0To100 = 0..100
    numbersFrom0To100.forEach() { number ->
        val mod3 = number % 3 == 0
        val mod5 = number % 5 == 0

        if (mod3 && mod5) print("fizzbuzz")
        else if (mod3) print("fizz")
        else if (mod5) print("buzz")
        else print(" $number ")

    }
    println("")

    for (number in 0..100){
        print(
            when {
                number % 15 == 0 -> "fizzbuzz"
                number % 3 == 0 -> "fizz"
                number % 5 == 0 -> "buzz"
                else -> " $number "
            }
        )
    }
    println("")


    // Exercise 4
    val words = listOf("dinosaur", "limousine", "magazine", "language")

    for(word in words){
        if(word.startsWith("l")){
            print(word)
        }
    }
    println("")
    println("---")

    //alternative solution with filter
    val startsWithL = words.filter { word -> word.startsWith("l") }
    print(startsWithL.count())
    print(startsWithL)


}