fun main(){

    println("please enter a number:")
    val n = Integer.valueOf(readLine())
    var f = 1
    for(i in n downTo 1){
        f *= i
    }
    print("Factorial of $n is " + f)

}