fun main(){
    println("Enter a positive integer:")
    val n = Integer.valueOf(readLine())
    var sum = 0
    for (i in 2..n step 2) sum += i
    print("Sum of even integers form 0 to $n is " + sum)
}