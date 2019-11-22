package ru.tinkoff.lesson10

fun main() {
    val arrayList = arrayListOf("Крош", "Ежик", "Нюша", "Бараш")
    val hashSet = hashSetOf("Крош", "Ежик", "Нюша", "Бараш")
    arrayList.forEach { element -> println(element) }
    hashSet.forEach { element -> println(element) }
}