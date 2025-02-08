//fun main() {
//
//    val list1 = listOf(1, 2, 3, 4, 5)
//    val list2 = listOf(3, 4, 5, 6, 7)
//
//    val intersection = list1.intersect(list2).sorted()
//
//    println("Общие числа в порядке возрастания: $intersection")
//}

fun main() {
    val set1 = setOf(1, 2, 3, 4, 5, 6)
    val set2 = setOf(4, 5, 6, 7, 8, 9)

    val commonNumbers = set1.intersect(set2).sorted()

    println(commonNumbers)
}
