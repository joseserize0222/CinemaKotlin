fun main() {
    val char : Char = readln().first()
    print((char.isDigit() || char.isUpperCase()) && char != '0')
}