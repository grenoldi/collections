package desktop.grenoldi.kotlin.collections

fun main(){
    val john = Employee("John", 1000.0, "PJ")
    val mary = Employee("Mary", 3000.0, "CLT")
    val jack = Employee("Jack", 2100.0, "CLT")

    val employees = listOf(john, mary, jack)

    employees.forEach { println(it) }

    println()
    
    println(employees.find{ it.name == "Mary"}) 

    println()

    employees.sortedBy{it.salary}.forEach{println(it)}

    println()

    employees.groupBy{it.ctype}.forEach{println(it)}
}

data class Employee(val name: String, val salary: Double, val ctype: String) {
	override fun toString(): String = 
	"""
		Name: $name
		Salary: $salary
		Type: $ctype
	""".trimIndent()
}