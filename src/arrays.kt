fun main(args: Array<String>) {
    val myArray= arrayOf(7,8,6,1,9,45,56)
    val myArray2= arrayOf("Kenya","Rwanda","Tanzania","Uganda")
    myArray2[4]="USA"

    println(myArray[1])
    println("I was born in ${myArray2[0]}")

    for (i in myArray2){
        println(i)
    }

}