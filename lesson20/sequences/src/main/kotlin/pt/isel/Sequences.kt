package pt.isel


fun iterable() : Iterable<String> {
    return listOf("Instituto", "Superior", "de", "Engenharia", "de", "Lisboa")
}

fun sequence() : Sequence<String> {
    return sequenceOf("Instituto", "Superior", "de", "Engenharia", "de", "Lisboa")
}


fun main(args: Array<String>) {
    val strings = sequence()

    var count = 0
    val seq = strings
        .map { count++; it.length >3 }
        //.myMap { count++; it }
        .take(2)


//    val iterator = seq.iterator()
//    println(iterator.next())
//    println(iterator.next())



//    val iterator1 = seq.iterator()
//    println(iterator1.next())
//    println(iterator1.next())
//
//
////    //iterator1.hasNext()
//    val iterator2 = seq.iterator()
//    println(iterator2.next())
//    println(iterator1.next())

////    println(iterator1.next())
//
//        //.sum()
    println(seq.toList())
    println("Count incremented ${count} times." )

}