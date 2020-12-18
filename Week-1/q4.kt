fun main(){
    println("Enter an integer:")
    val number = Integer.valueOf(readLine())
    val answer = divisibility(number)
    print(answer)
}
fun divisibility( x:Int) : String{
    var count = 0
    if (x % 11 == 0 && x % 5 == 0){
            count = 1
    }
    return if (count == 1) "True"
    else "False"
}