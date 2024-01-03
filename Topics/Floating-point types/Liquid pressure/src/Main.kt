const val GRAVITY : Double = 9.8
fun main() {
    val density = readln().toDouble()
    val height = readln().toDouble()
    val pressure = GRAVITY*density*height
    println(pressure)
}