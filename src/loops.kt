fun main(args: Array<String>) {
    var num=10

    while (num>=5){
        println(num)
        num-=2
    }
    val students= arrayOf("James", "Daniel", "Mark", "Anne", "Abigael")
    students.sort()
    for  (i in students){
        println(i)
    }
    val nambari= arrayOf(23,15,45,1,8,20,-2,3,2,0,41,-45)
    val sortednambari = nambari.sortedDescending()

    for (a in sortednambari){
        println(a)
    }

}