package ru.tinkoff.lesson12

fun main() {
    val list = listOf("Хрюша", "Степаша", "Филя", "Гуля").filter { it.length < 6 }
    println(list)
}