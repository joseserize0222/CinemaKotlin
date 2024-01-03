fun main() {
    val n = readln().toInt()
    var cnt : Int = 0
    var rep = 1
    var number = '1'
    while(cnt <= n){
        val result : String = number.toString() + " "
        print(result.repeat(Math.min(rep, n-cnt)))
        cnt += rep
        rep++
        number++
    }
}