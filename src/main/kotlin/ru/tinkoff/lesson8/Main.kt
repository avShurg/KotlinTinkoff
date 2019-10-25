package ru.tinkoff.lesson8

import kotlinx.coroutines.*

fun main() {
    val petJuchka = Pet("Жучка", 1000)
    val petTuchka = Pet("Тучка", 4000)
    val petGuchka = Pet("Гучка", 2000)
    val petBuchka = Pet("Бучка", 5000)
    val petRuchka = Pet("Ручка", 500)

    runBlocking {
        launch { petJuchka.eat() }
        launch { petTuchka.eat() }
        launch { petGuchka.eat() }
        launch { petBuchka.eat() }
        launch { petRuchka.eat() }
    }
    println("Животные накормлены")

    val asyncFeed = GlobalScope.async {
        launch { petJuchka.eat() }
        launch { petTuchka.eat() }
        launch { petGuchka.eat() }
        launch { petBuchka.eat() }
        launch { petRuchka.eat() }
    }
    println("Еду всем раздал")
    runBlocking { asyncFeed.await() }
    println("Животные накормлены")
}