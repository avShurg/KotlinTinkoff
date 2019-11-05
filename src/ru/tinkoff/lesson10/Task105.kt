package ru.tinkoff.lesson10

fun main() {
    val list = listOf("Крош", "Ежик", "Нюша", "Бараш")
    val set = setOf("Крош", "Ежик", "Нюша", "Бараш")
    val arrayList = ArrayList<String>()
    list.forEach { element -> arrayList.add(element) }
    arrayList.forEach { element -> println(element) }
    val hashSet = HashSet<String>()
    set.forEach { element -> hashSet.add(element) }
    hashSet.forEach { element -> println(element) }
}