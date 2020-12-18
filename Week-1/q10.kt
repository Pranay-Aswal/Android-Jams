fun main(){
    println("Enter height of half pyramid:")
    val height = Integer.valueOf(readLine())
    for (i in 1..height) {
        for (j in 1..i) print("#")
        println()
    }

}