package ru.tinkoff.lesson8

fun main() {
    run {
        listOf("three", "two", "one").forEach {
            if (it == "one") {
                return@run
            }
            println(it)
        }
    }
    println("boom!")
}