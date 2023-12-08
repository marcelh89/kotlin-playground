package tour.collections

fun main(){

    val readonly = setOf("one", "two", "three") // immutable
    println(readonly)

    val mutable: MutableSet<String> = mutableSetOf("one", "two", "three") // mutable
    mutable.add("three")
    println(mutable)
    val immutable: Set<String> = mutable  // immutable through type cast
    println(immutable)


    println(immutable.first())
    println(immutable.last())
    println("The immutable list has $immutable.count() items")

}