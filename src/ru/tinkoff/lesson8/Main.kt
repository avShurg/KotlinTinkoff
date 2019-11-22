package ru.tinkoff.lesson8

fun main() {
    listOf("three", "two", "one").forEach {
        if (it == "one") {
            return@forEach
        }
        println(it)
    }
    println("boom!")
}