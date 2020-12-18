fun main(){
    println("Enter three integers:")

    val a = Integer.valueOf(readLine())
    val b = Integer.valueOf(readLine())
    val c = Integer.valueOf(readLine())
    val x = max(a,b)
    val y = max(b,c)
    print("The max integer is " + max(x,y))

}

fun max(x: Int, y: Int) : Int {
    return if (x > y) x else y
}