fun main() {
    val n = readln().toInt()
    val list = mutableListOf<Int>()
    var result = true
    repeat(n){
        list.add(readln().toInt())
        if(it != 0){
            result = result && (list[it] >= list[it-1])
        }
    }
    print(if(result) "YES" else "NO")
}