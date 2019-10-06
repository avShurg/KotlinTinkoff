package ru.tinkoff

class Snake(var name: String, var age: Int = 0) : Walkable, Pet() {

    override fun walk() {
        println("$name ползает")
    }
}