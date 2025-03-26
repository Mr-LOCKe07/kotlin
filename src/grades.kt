fun main(args: Array<String>) {
    print("Input marks:")
    val grade=Integer.valueOf(readlnOrNull())

    if (grade in 80..100){
        println("Distinction")
    }
    else if (grade in 60..80){
        println("Credit")
    }
    else if (grade>=50){
        println("Pass")
    }
    else if (grade<50){
        println("Fail")
    }
    else{
        println("Unassigned")
    }
}




