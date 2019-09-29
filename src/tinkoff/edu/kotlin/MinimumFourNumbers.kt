package tinkoff.edu.kotlin

fun minimumFourNumbers(a: Int, b: Int, c: Int, d: Int): Int {
    val min1 = if (a < b) a else b
    val min2 = if (c < d) c else d
    return if (min1 < min2) min1 else min2
}