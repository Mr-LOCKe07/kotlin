fun main(args: Array<String>) {
    print("Enter Number:")
    val num=Integer.valueOf(readlnOrNull())

    if (num%2 == 0){
        println("$num is an even number")
    }
    else{
        println("$num is an odd number")
    }

    print("Enter your age:")
    val age=Integer.valueOf(readlnOrNull())

    if (age>=18){
        println("You are eligible to vote")
    }
    else{
        println("You are not eligible to vote")
    }
}