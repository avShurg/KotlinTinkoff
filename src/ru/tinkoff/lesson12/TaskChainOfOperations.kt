package ru.tinkoff.lesson12

fun main() {
    val listCartoon = listOf("Хрюша", "Степаша", "Филя", "Гуля")
            .asSequence()
            .filter { it.length <= 4 }
            .map { "Привет $it" }
            .toList()
    println(listCartoon)
}