package ru.tinkoff

class Cat(var name: String, var age: Int) : Voiceable, Walkable, Swimable {

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