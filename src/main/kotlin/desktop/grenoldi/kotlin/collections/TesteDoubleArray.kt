package desktop.grenoldi.kotlin.collections

fun main(){
    //val values = DoubleArray(3)
    //values[0] = 1000.0
    //values[1] = 3000.0
    //values[2] = 500.0

    val values = doubleArrayOf(1500.00, 1250.00, 5000.00)

    for (index in values.indices){
    	println(values[index])
    }

    println()

    for (value in values) {
        println(value)
    }

    println()

    values.forEach { value ->
    	println(value*value)
    }

    println()

    values.sort()

    values.forEach { value ->
    	println(value)
    }


    println()

    values.forEachIndexed { index, value ->
        values[index] = value*1.1
    }

    values.forEach {
        println(it)
    }
}