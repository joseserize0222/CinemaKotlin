fun main() {
    val n = readln().toInt()
    val list = mutableListOf<Int>()
    repeat(n){
        list += readln().toInt()
    }
    val (P, M) = readln().split(" ")
    val p = P.toInt()
    val m = M.toInt()
    print(if(list.contains(p) && list.contains(m)) "YES" else "NO")
}