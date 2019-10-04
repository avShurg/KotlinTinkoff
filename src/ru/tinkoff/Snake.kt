package ru.tinkoff

class Snake(var name: String, var age: Int) : Walkable, Pet() {

    override fun walk() {
        println("$name ползает")
    }
}