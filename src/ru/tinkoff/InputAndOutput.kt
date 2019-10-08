package ru.tinkoff

import java.util.*

val myScan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val name = myScan.next()
    val number1 = myScan.nextInt()
    val number2 = myScan.nextInt()
    println("$name получает $number1 через $number2 лет")
}