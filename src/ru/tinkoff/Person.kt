package ru.tinkoff

data class Person(
    val lastName: String,
    val firstName: String,
    val age: Int,
    val postcode: Int,
    val phone: String
) {
    companion object : Comparator<Person> {
        override fun compare(p0: Person?, p1: Person?): Int {
            return if (p0 != null && p1 != null) {
                when {
                    p0.age > p1.age -> 1
                    p0.age < p1.age -> -1
                    else -> 0
                }
            } else {
                if (p0 != null && p1 == null) 1
                else if (p1 != null && p0 == null) -1
                else 0
            }
        }
    }
}

object PersonComparator : Comparator<Person> {
    override fun compare(p0: Person?, p1: Person?): Int {
        return if (p0 != null && p1 != null) {
            when {
                p0.age > p1.age -> 1
                p0.age < p1.age -> -1
                else -> 0
            }
        } else {
            if (p0 != null && p1 == null) 1
            else if (p1 != null && p0 == null) -1
            else 0
        }
    }
}