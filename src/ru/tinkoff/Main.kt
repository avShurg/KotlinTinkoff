package ru.tinkoff

fun main() {
    var pet = Pet()
    pet.apply {
        nickname = "pops"
        age = 3
        sex = "man"
    }
    pet.also {
        it.nickname = "bob"
        it.age = 1
        it.sex = "women"
    }
    pet.let {
        it.nickname = "kesha"
        it.age = 1
        it.sex = null
    }
    with(pet) {
        nickname = "masha"
        age = 6
        sex = null
    }
}