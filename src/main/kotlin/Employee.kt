//
abstract class Employee {
    abstract val name: String
    abstract val salary: Double

    abstract fun work()

    abstract fun calculateAnnualBonus()

      fun details() {
         println("The annual bonus of " + name + " is " + salary)
    }
}

abstract class Developer: Employee() {

}

abstract class Manager: Employee() {

}

abstract class Designer: Employee() {

}