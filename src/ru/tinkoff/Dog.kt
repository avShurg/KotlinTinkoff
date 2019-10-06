package ru.tinkoff

class Dog(var name: String, var age: Int = 0) : Voiceable, Walkable, Swimable, Pet() {

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