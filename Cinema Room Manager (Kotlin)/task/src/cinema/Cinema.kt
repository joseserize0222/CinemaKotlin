package cinema
import java.util.Locale
import java.lang.Exception
import java.lang.IndexOutOfBoundsException


fun display(list : MutableList<MutableList<String>>){
    println("\nCinema:")
    print(" ")
    repeat(list.first().size){
        print(" ${it+1}")
    }
    println()
    for(i in list.indices){
        println("${i+1} ${list[i].joinToString(" ")}")
    }
}
fun price(x : Int, y : Int, rows : Int, columns : Int): Int {
    val result = if(rows * columns <= 60){
        10
    }
    else{
        if(x <= rows/2){
            10
        }
        else 8
    }
    return result
}
fun buyATicket(mat : MutableList<MutableList<String>>, rows : Int, column : Int) : Int{
    println("\nEnter a row number: ")
    val x = readln().toInt()
    println("Enter a seat number in that row: ")
    val y = readln().toInt()
    if(mat[x-1][y-1] == "B") throw Exception("That ticket has already been purchased!")
    print("\nTicket price: \$${price(x,y,rows,column)}")
    mat[x-1][y-1] = "B"
    println()
    return price(x,y,rows,column)
}

fun displayStatistics(){

}
fun main() {
    println("Enter the number of rows:")
    val rows : Int = readln().toInt()
    println("Enter the number of seats in each row:")
    val column : Int = readln().toInt()
    val mat = MutableList(rows){ MutableList<String>(column){"S"}}
    var numberOfSeats = 0
    var income : Int = 0
    var percentage : Double = 0.0
    var totalIncome = if(rows*column <= 60) (rows*column*10) else ((rows/2)*10 + (rows-rows/2)*8)*column

    val options = """
        
            1. Show the seats
            2. Buy a ticket
            3. Statistics
            0. Exit
        """.trimIndent()
    while(true){
        println(options)
        val op = readln()
        when(op){
            "1" -> display(mat)
            "2" -> {
                while(true){
                    try{
                        income += buyATicket(mat,rows,column)
                        numberOfSeats++
                        percentage = (numberOfSeats.toDouble()/(rows*column).toDouble())*100
                        break
                    }
                    catch(e : IndexOutOfBoundsException){
                        println("\nWrong input!")
                    }
                    catch (e : Exception){
                        println("\n" + e.message)
                    }
                }
            }
            "3"-> {
                println()
                println("Number of purchased tickets: $numberOfSeats")
                println("Percentage: ${"%.2f".format(Locale.US,percentage)}%")
                println("Current income: \$$income")
                println("Total income: \$$totalIncome")
            }
            "0" -> break
        }
    }
}