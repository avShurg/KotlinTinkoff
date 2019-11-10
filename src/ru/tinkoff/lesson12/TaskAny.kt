package ru.tinkoff.lesson12

fun main() {
    val list = listOf("Хрюша", "Степаша", "Филя", "Гуля")
    val lengthSeven = list.any { it.length == 8 }
    println(lengthSeven)
}