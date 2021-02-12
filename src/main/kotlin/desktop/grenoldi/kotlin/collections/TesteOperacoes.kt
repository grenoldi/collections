package desktop.grenoldi.kotlin.collections

fun main(){
	val salarios = doubleArrayOf(1000.00, 2250.00, 4000.00, 2100.00, 2500.01, 8300.00, 750.00, 12500.00)
	salarios.forEach{ println(it) }

	println()

	println("Maior salario: ${salarios.maxOrNull()}")
	println("Menor salario: ${salarios.minOrNull()}")
	println("Salario medio: ${salarios.average()}")

	val salariosMaioresQue2500 = salarios.filter{ it > 2500 }
	println()
	
	println("Salarios maiores que 2500:")
	salariosMaioresQue2500.forEach { println(it) }

	println()

	println(salarios.count{ it in 2000.0..5000.0 })

	println()

	println(if (salarios.find{ it == 2500.01 } == null) "Nao achei" else "Achei")


}