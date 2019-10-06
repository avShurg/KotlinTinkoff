package ru.tinkoff

class Parrot(var name: String, var age: Int = 0) : Voiceable, Flyable, Pet() {

    override fun voice() {
        println("Чирик-чирик")
    }

    override fun fly() {
        println("$name летает")
    }
}