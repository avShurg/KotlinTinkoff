package ru.tinkoff

class Cat(var name: String, var age: Int = 0) : Voiceable, Walkable, Swimable, Pet() {

    override fun voice() {
        println("Мяу-мяу")
    }

    override fun walk() {
        println("$name гуляет")
    }

    override fun swim() {
        println("$name плавает")
    }
}