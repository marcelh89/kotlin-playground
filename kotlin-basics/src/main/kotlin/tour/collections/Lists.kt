package tour.collections

fun main(){

    val readonly = listOf("one", "two", "three") // immutable
    println(readonly)

    val mutable: MutableList<String> = mutableListOf("one", "two", "three") // mutable
    mutable.add("four")
    println(mutable)
    val immutable: List<String> = mutable  // immutable through type cast
    println(immutable)


    println(immutable.first())
    println(immutable.last())
    println("The immutable list has $immutable.count() items")
    println("The immutable list ${if ("three" in immutable) "contains" else "does not contain"} \"three\"")

}