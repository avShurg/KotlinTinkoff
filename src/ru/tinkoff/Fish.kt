package ru.tinkoff

class Fish(var name: String, var age: Int) : Swimable {

    override fun swim() {
        println("$name плавает")
    }
}