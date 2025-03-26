class Myclass{
//    data member
    var name="My name is Blaise"

//    member function
    fun display(){
        println(name)
    }
}
//creating object for carclass
class Car{
    var model= ""
    var make=""
    var yearofman=0
}

fun main(args: Array<String>) {
    val obj=Myclass()
    obj.display()
    val myobj2=Car()
    myobj2.model="Mercedes"
    myobj2.make="S-class"
    myobj2.yearofman=2018

    println("My favorite car model is ${myobj2.model} being an ${myobj2.make} manufactured in the year ${myobj2.yearofman}")

}
