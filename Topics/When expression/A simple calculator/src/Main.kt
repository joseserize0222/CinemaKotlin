import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val number1 =  scanner.nextLong()
    val op = scanner.next()
    val number2 = scanner.nextLong()
    scanner.close()
    print(when(op){
        "+" -> number1+number2
        "-" -> number1-number2
        "/" -> if(number2 == 0L) "Division by 0!" else number1/number2
        "*" -> number1*number2
        else -> "Unknown operator"
    })
}