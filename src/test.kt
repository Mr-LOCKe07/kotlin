fun main(args: Array<String>) {
//    lists
    val readOnlyShapes = listOf("triangle","circle","square")
    println("The first item in the list is: ${readOnlyShapes[0]}")
    println("The last item in the list is: ${readOnlyShapes.last()}")


    val shapes: MutableList<String> = mutableListOf("triangle","circle","square")
    shapes.add("Pentagon")
    shapes.remove("triangle")
    println(shapes)
//    sets

}