package ru.tinkoff.lesson10

fun main() {
    val list = listOf("Крош", "Ежик", "Нюша", "Бараш")
    val set = setOf("Крош", "Ежик", "Нюша", "Бараш")
    list.forEach { element -> println(element) }
    set.forEach { element -> println(element) }
}