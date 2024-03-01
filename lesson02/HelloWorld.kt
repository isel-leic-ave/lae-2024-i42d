

fun f(i: Int, s: String) {
    require(i > 5) { "I must be greater than 5"}
    println("i is greater than 5")
}

fun main() {
    println("Glorioso SLB")
    f(6, "SLB")
}
