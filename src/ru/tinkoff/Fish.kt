package ru.tinkoff

class Fish(var name: String, var age: Int = 0) : Swimable, Pet() {

    override fun swim() {
        println("$name плавает")
    }
}