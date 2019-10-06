package ru.tinkoff

abstract class Pet {
    var checkRunAway = false
        private set
    private var countFeed = 0

    fun feed() {
        if (checkRunAway) {
            runAway()
            return
        }
        countFeed++
        if (countFeed > 1) {
            runAway()
            return
        }
        println("питомец покормлен")
    }

    fun cleanUp() {
        if (checkRunAway) {
            runAway()
            return
        }
        countFeed = 0
        println("за питомцем убрано")
    }

    fun play() {
        if (checkRunAway) {
            runAway()
            return
        }
        println("питомец поиграл")
    }

    private fun runAway() {
        checkRunAway = true
        println("питомец сбежал")
    }
}