package ru.tinkoff

class Parrot(var name: String, var age: Int) : Voiceable, Flyable, Pet() {

    override fun voice() {
        println("Чирик-чирик")
    }

    override fun fly() {
        println("$name летает")
    }
}