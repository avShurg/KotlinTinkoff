package ru.tinkoff

class Snake(var name: String, var age: Int) : Walkable {

    override fun walk() {
        println("$name ползает")
    }
}