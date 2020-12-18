fun main(){
    println("Enter a character:")
    val char = readLine()?.single()
    if(char in 'a'..'z' || char in 'A'..'Z') print("Character $char is an Alphabet")
    else print("Character $char is not an Alphabet")
}
