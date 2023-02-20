import classes.ItemClassicClass
import conditions.demoIf
import exceptions.throwException
import functions.Functions
import functions.getMessageFor
import loops.demoDoWhile
import loops.demoFor
import loops.demoWhile
import nullable.Nullable
import variables.Variables

fun main(args: Array<String>) {
    println("Hello Kotlin!")

    // functions
    println("--------------functions------------")
    println(Functions().getMessage())
    println(getMessageFor("test"))

    // variables
    println("--------------variables------------")
    val finalVariableExample = Variables("final String", 10)
    finalVariableExample.printValues()
    //finalVariableExample.name = "other" // won't work
    finalVariableExample.age = 11 // will work
    finalVariableExample.printValues()
    println(getMessageFor("test"))

    // classes
    println("--------------classes------------")
    var classicClass = ItemClassicClass("Tim", 1, false)
    println("classic class without toString$classicClass")
    var dataClass = ItemClassicClass("Tim", 2, false)
    println("dataClass with toString$dataClass")

    //conditions
    println("--------------conditions------------")
    demoIf()

    //loops
    println("--------------loops------------")
    demoFor()
    demoDoWhile()
    demoWhile()

    // nullable
    println("--------------nullable------------")
    var nullableExample = Nullable("nonNullableText", "nullableText")
    println(nullableExample.nonNullableText.substring(0, 2))
    println("nullcheck with ? " + nullableExample.nullableText?.substring(0, 2))
    println("skip the nullcheck with !! " + nullableExample.nullableText!!.substring(0, 2))

    // exceptions
    println("--------------exceptions------------")
    try {
        throwException()
    } catch (e: Exception) {
        println(e.message)
    }

    // lists
    println("--------------lists------------")
    var immutableList = listOf("1", "2", "3")
    var mutableList = mutableListOf("1")
    mutableList.add("3")
    println(mutableList[1] == immutableList.last())

    // stream
    println("--------------stream------------")
    //immutableList.stream().forEach { entry -> println(entry) }
    immutableList.stream().forEach { println(it) } // calling param name "it" you can leave param and arrow
    
}