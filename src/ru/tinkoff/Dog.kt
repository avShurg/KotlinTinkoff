package ru.tinkoff

class Dog(var name: String, var age: Int) : Voiceable, Walkable, Swimable {

    override fun voice() {
        println("Гав-гав")
    }

    override fun walk() {
        println("$name гуляет")
    }

    override fun swim() {
        println("$name плавает")
    }
}