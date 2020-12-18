import kotlin.math.pow

fun main(){
    println(" Enter any positive number:")
    var num = Integer.valueOf(readLine())
    val c = num
    var b = 0
    var a : Int
    var n = 0
    while(num != 0){
        num/= 10
        ++n
    }

    num = c
    
    while (num > 0)
    {
        a = num % 10
        num /= 10
        b += a.toDouble().pow(n.toDouble()).toInt()
    }
    if(c==b)
        println("$c is an armstrong number")
    else
        println("$c is not an armstrong number")
}
