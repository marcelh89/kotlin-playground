package tour.collections

fun main() {
    val readonly = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readonly)

    val writable: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    writable.put("coconut", 100)
    //writable["coconut"] = 100 // above line can also be written as
    print(writable)
    val locked: Map<String, Int> = writable
    print(locked)

}