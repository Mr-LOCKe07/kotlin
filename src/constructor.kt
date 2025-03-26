class Student(val name:String, val age:Int){


}

fun main(args: Array<String>) {
//    object
    val stud1= Student("Blaise",17)

    println("Stud name: ${stud1.name}")
    println("Stud gae: ${stud1.age}")

}