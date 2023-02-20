package variables

class Variables(val name: String, var age: Int) {

    // changable "var"
    private var text = "Parameter name ="

    // fixed "val" (changes throw compile errors)
    private val replacement = "age"

    fun printValues() {
        println(text + name)
        text = text.replace("name", replacement)
        println(text + age)
    }
}