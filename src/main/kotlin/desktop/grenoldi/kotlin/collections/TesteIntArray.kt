package desktop.grenoldi.kotlin.collections

fun main(){
    val values = IntArray(5)
    values[0] = 11
    values[1] = 42
    values[2] = 13
    values[3] = 34
    values[4] = 15

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
}