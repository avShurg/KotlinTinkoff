package ru.tinkoff

import java.util.Scanner

class Car() {
    fun ride(km: Int) {
        // Ваш код здесь
        println("Поехали")
        var N = km
        while (N > 0) {
            println("Осталось ${N--} километров")
        }
        println("Приехали")
    }
}
val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val car = Car()
    car.ride(scan.nextInt())
}