fun main(){
    println(" Enter a three digit number:")
    var num = Integer.valueOf(readLine())
    val c = num
    var b = 0
    var a : Int
    while (num > 0)
    {
        a=((num%10)*(num%10)*(num%10))
        num /= 10
        b += a
    }
    if(c==b)
        println("$c is an armstrong number")
    else
        println("$c is not an armstrong number")
}
