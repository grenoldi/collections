package desktop.grenoldi.kotlin.collections

fun main(){
    val john = Employee("John", 1000.0, "PJ")
    val mary = Employee("Mary", 3000.0, "CLT")
    val jack = Employee("Jack", 2100.0, "CLT")

    val emp1 = setOf(john, jack)
    val emp2 = setOf(mary)
    val emp3 = setOf(john, jack, mary)


    val empr1 = emp1.union(emp2)

    empr1.forEach{ 
    	println(it) 
    	println()
    }

	println("------------")

	val empr2 = emp3.subtract(emp2)

    empr2.forEach{ 
    	println(it) 
    	println()
    }

    println("------------")

	val empr3 = emp3.intersect(emp2)

    empr3.forEach{ 
    	println(it) 
    	println()
    }
}

data class Employee(val name: String, val salary: Double, val ctype: String) {
	override fun toString(): String = 
	"""
		Name: $name
		Salary: $salary
		Type: $ctype
	""".trimIndent()
}