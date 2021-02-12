package desktop.grenoldi.kotlin.collections

fun main(){
	val values = intArrayOf(2, 3, 4, 1, 10, 7, 12, 9, 21, 17)

	values.sort()
	
	values.forEach { 
		println(it)
	}
}