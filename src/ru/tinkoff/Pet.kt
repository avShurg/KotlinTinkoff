package ru.tinkoff

abstract class Pet {
    fun feed() {
        println("питомец покормлен")
    }

    fun cleanUp() {
        println("за питомцем убрано")
    }

    fun play() {
        println("питомец поиграл")
    }
}