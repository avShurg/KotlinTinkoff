package ru.tinkoff.lesson12

import kotlin.math.max

fun main() {
    val list = listOf("Хрюша", "Степаша", "Филя", "Гуля")
    var maxLength = 0
    list.forEach {
        if (it.length > maxLength) {
            maxLength = it.length
        }
    }
    val nameLengthMax = list.find { it.length == maxLength }
    println(nameLengthMax)
}