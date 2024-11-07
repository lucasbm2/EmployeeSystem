//


interface Evaluable {
    fun evaluatePerformance() {
        println("Employee evaluated")
    }
}

abstract class Employee {
    abstract val name: String
    abstract val salary: Double

    abstract fun work()

    abstract fun calculateAnnualBonus(): Double

    fun details() {
        println("The annual bonus of " + name + " is " + salary)
    }
}

abstract class Developer : Employee(), Evaluable {
    override fun work() {
        println("Writing and reviewing code.")
    }

    override fun calculateAnnualBonus(): Double {
        return salary + salary * 0.10
    }
}

abstract class Manager : Employee() {
    override fun work() {
        println("")
    }

    override fun calculateAnnualBonus(): Double {
        return salary + salary * 0.20
    }

}

abstract class Designer : Employee() {
    override fun work() {
        println("")
    }

    override fun calculateAnnualBonus(): Double {
        return salary + salary * 0.15
    }

}