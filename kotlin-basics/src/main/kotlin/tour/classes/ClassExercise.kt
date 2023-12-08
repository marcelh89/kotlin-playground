package tour.classes

/**
 * Exercise 1
 * Define a data class Employee with two properties: one for a name,
 * and another for a salary. Make sure that the property for salary is mutable,
 * otherwise you won’t get a salary boost at the end of the year! The main function
 * demonstrates how you can use this data class.
 */

/**
 * Exercise 2
 * To test your code, you need a generator that can create random employees.
 * Define a class with a fixed list of potential names (inside the class body),
 * and that is configured by a minimum and maximum salary (inside the class header).
 * Once again, the main function demonstrates how you can use this class.
 */
data class Employee(val name: String, var salary: Int)

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    private val possibleNames = arrayOf("Tim", "Sandra", "John", "Suzie", "Frank", "Jack", "Paula", "Elisabeth")

    fun generateEmployee(): Employee{
        val salary = (minSalary .. maxSalary).random()
        //val salary = Random.nextInt(from = minSalary, until = maxSalary)
        //val name = possibleNames[possibleNames.indices.random()]
        val name = possibleNames.random()
        return Employee(name, salary)
    }
}
fun main() {
    val emp = Employee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)

    // exercise 2
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}