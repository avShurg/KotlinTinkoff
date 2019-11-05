package ru.tinkoff.lesson10

fun main() {
    val arrayList = ArrayList<String>()
    arrayList.addAll(arrayListOf("Крош", "Ежик", "Нюша", "Бараш"))
    val hashSet= HashSet<String>()
    hashSet.addAll(hashSetOf("Крош", "Ежик", "Нюша", "Бараш"))
    arrayList.forEach { element -> println(element) }
    hashSet.forEach { element -> println(element) }
}