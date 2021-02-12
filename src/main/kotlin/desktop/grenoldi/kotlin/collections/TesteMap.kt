package desktop.grenoldi.kotlin.collections

fun main(){
	val pair: Pair<String, Double> = Pair("John", 1000.0)
	val map1 = mapOf(pair)

	map1.forEach{(k, v) -> println("Key: $k - Value: $v")}

	val map2 = mapOf("Peter" to 2500.0, "Mary" to 3000.0, "Jack" to 2100.0)

	println("-----------")

	map2.forEach{(k, v) -> println("Key: $k - Value: $v")}
}