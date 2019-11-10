package ru.tinkoff.lesson12

fun main() {
    val listCartoon = listOf("Хрюша", "Степаша", "Филя", "Гуля")
    val newList = listCartoon.filter { it.length <= 4 }.map { "Привет $it" }
    println(newList)
}