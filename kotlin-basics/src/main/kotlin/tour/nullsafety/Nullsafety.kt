package tour.nullsafety


fun nullcheck(nullable: String?): String{
    if(nullable != null && nullable.length > 0){
        return "String of length ${nullable.length}"
    } else {
        return "Empty or null string"
    }
}
fun main() {
    var neverNull: String = "cant be null"
    //neverNull = null; // <-- compiler does not allow this

    var nullable: String? = "can be null"
    nullable = if((0 .. 1).random() == 0) null else "some string"  // random toggle between null and "some string"

    // nullcheck
    println(nullcheck(nullable))

    // lengthstring
    println(nullable?.length)
    println(nullable?.length ?: 0) // elvis operator

}