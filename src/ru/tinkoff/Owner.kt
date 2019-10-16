package ru.tinkoff

class Owner<P : Pet>(var pet: P) {
    fun feed() {
        println("Домашнее животное ${pet.nickname} накормлено")
    }
}