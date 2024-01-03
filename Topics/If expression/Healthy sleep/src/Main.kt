fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    when{
        c in a..b -> print("Normal")
        c < a -> print("Deficiency")
        else -> print("Excess")
    }
}