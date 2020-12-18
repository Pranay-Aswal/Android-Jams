fun main(){

    println("please enter a number:")
    val n = Integer.valueOf(readLine())
    var sum = 0
    for (i in n downTo 1)
        sum += factorial(i)
    print("Factorial sum is "+ sum)

}

fun factorial(n : Int) : Int{
    var f = 1
    for(i in n downTo 1)  f *= i
    return f
}
