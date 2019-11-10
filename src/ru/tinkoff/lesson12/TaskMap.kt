package ru.tinkoff.lesson12

fun main() {
    val list = listOf("Хрюша", "Степаша", "Филя", "Гуля").map { "Привет $it" }
    println(list)
}