import java.util.*
fun main() {
    var sum = 0
    var scanner = Scanner(System.`in`)
    while(scanner.hasNextInt()){
        val n = scanner.nextInt()
        sum += n
        if(n == 0) break
    }
    print(sum)
}