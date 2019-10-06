package ru.tinkoff.task2

open class Cat {
    open fun hunt () {
        println("Я охочусь на мышей, ведь я кот!")
    }
}
class HomeCat : Cat() {
    fun hunt(flag: Boolean) {
        if (flag)
            super.hunt()
        else
            println("Ты че сдурел? Какие мыши? Иди корми меня, ленивая задница!")
    }
}