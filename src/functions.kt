fun myfunction(){
    println("This is my first function")
}
fun main(args: Array<String>) {
    myfunction()
    addtwonum()
}
fun addtwonum(){
    print("Enter first number:")
    val num=Integer.valueOf(readlnOrNull())

    print("Enter second number:")
    val num2=Integer.valueOf(readlnOrNull())

    println("The sum of $num and $num2 is ${num+num2}")
}
fun Studreg(fname:String,lname:String,age:Int){
    println("Students first name is: $fname, last name: $lname and $age years")
}