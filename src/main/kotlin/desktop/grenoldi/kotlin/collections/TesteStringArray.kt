package desktop.grenoldi.kotlin.collections

fun main(){
    val names = arrayOf("Mary", "John", "Jason")

    names.forEach {
        println(it)
    }

    println()

    names.sort()

    names.forEach { 
    	println(it)
    }
}