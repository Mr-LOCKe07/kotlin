fun main(args: Array<String>) {
    print("Enter your name:")

    val enterName= readlnOrNull()
    println("Welcome $enterName")

    print("Enter number:")

    val enterNum= Integer.valueOf(readlnOrNull())
    println("Entered number is $enterNum")
}