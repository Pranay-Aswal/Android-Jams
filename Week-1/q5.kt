fun main(){
    println("Enter sides of the triangle:")
    val a = Integer.valueOf(readLine())
    val b = Integer.valueOf(readLine())
    val c = Integer.valueOf(readLine())

    if(a == b && b == c) print("Equilateral Triaangle")
    else if (a != b && b!= c && c != a) print("Scalene Triangle")
    else print("Isosceles Triangle")

}