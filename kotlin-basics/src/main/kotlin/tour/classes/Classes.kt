package tour.classes




// declare properties for a class within parentheses
class Contact(val name: String, var email: String)

// declare properties for a class within the class body defined by curly braces
class Customer(val name: String, var email: String) {
    val category: String = ""

    // member function(s)
    fun printName(){
        println(name)
    }
}

// data classes (same as classes but including additional member functions e.g.
// toString() .equals() and .copy() and others
data class User(val name: String, val age: Int)



fun main() {

    // create class instance
    val contact = Contact("Tom", "tom@gmail.com")
    val customer = Customer("Tim", "tim@gmail.com")
    customer.email = "tim@web.de" // can be reassigned
    println(contact.email) // access property
    customer.printName()


    // data class
    val user1 = User("Sandy", 20)
    val copiedUser1 = user1.copy() // use .copy() from data class

    val user2 = User("Sandy", 44)

    println("User 1 and User 1 (copied) are equal ? ${user1 == copiedUser1}")
    println("User 1 and User 2 are equal ? ${user1 == user2}")

}