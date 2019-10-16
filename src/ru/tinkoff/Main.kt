package ru.tinkoff

fun main() {
    val dog = Pet().apply {
        nickname = "pops"
        age = 3
        sex = "man"
    }
    println(dog.nickname)
    val cat = Pet().also {
        it.nickname = "bob"
        it.age = 1
        it.sex = "women"
    }
    println(cat.nickname)
    val parrot = Pet().let {
        it.nickname = "kesha"
        it.age = 1
        it.sex = null
        it
    }
    println(parrot.nickname)
    val fish = with(Pet()) {
        nickname = "masha"
        age = 6
        sex = null
        this
    }
    println(fish.nickname)
}