fun main() {
    val n = readln().toInt()
    val list = mutableListOf<Int>()
    repeat(n){
        list += readln().toInt()
    }
    val shift = readln().toInt()
    repeat(n){
        print((list[((list.size-shift+it)%list.size + list.size)%list.size]).toString() + " ")
    }
}