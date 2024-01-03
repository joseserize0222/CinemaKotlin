fun main() {
    val number = readln().toInt()
    when(number){
        !in 1..4 -> println("Unknown number")
        2 -> println("Yes!")
        else -> println("No!")
    }
}
