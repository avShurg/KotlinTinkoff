package tinkoff.edu.kotlin

import java.util.*

val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val name = scan.next()
    val number1 = scan.nextInt()
    val number2 = scan.nextInt()
    println("$name получает $number1 через $number2 лет")
}