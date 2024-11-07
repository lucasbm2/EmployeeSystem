fun main() {

    val employees: List<Employee> = listOf(

        object : Developer() {
            override val name: String = "Lucas"
            override val salary: Double = 500.0
        },
        object : Manager() {
            override val name: String = "Dani"
            override val salary: Double = 800.0
        },
        object : Designer() {
            override val name: String = "Miguel"
            override val salary: Double = 50000.0
        }
    )

    for (employee in employees) {
        employee.work()
        employee.details()
        println("TOTAL SALARY WITH BONUS: ${employee.calculateAnnualBonus()}")

        if (employee is Evaluable) {
            employee.evaluatePerformance()
        }
        println("================")
    }
}
