fun main() {
    val num = readln().toDouble()
    println(num)
    val answer : Int = try { readLine()!!.toInt() } catch(e : NumberFormatException) { 42 }
        finally { println("The answer is a number") }
    println(answer)
}