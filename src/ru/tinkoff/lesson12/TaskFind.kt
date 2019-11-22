package ru.tinkoff.lesson12

import kotlin.math.max

fun main() {
    val list = listOf("Хрюша", "Степаша", "Филя", "Гуля")
    /**
     * Вариант исправленный на функцию max
     */
    var maxLength = 0
    list.forEach {
        maxLength = max(it.length, maxLength)
    }
    val nameLengthFind = list.find { it.length == maxLength }
    println(nameLengthFind)
    /**
     * Вариант без функции find
     */
    val nameLengthMax = list.maxBy { it.length}
    println(nameLengthMax)
}