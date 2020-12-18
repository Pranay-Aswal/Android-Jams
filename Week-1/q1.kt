fun main() {
    println("Enter an integer:")
    val number = Integer.valueOf(readLine())
    if (number%2==0){
        print("Even")
    }
    else print("Odd")
}