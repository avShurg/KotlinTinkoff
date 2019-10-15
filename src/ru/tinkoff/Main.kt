package ru.tinkoff

fun Pet.isAdult(): Boolean {
    return this.age >= 2
}

val Pet.respectableNickname: String
    get() = "Dear ${this.nickname}"

fun main() {
    val pet = Pet("Жучка", 2, false)
    println("Животное совершеннолетние? ${pet.isAdult()}")
    println(pet.respectableNickname)
}