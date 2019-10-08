package ru.tinkoff

fun sort(masInt: Array<Int>) {
    var buff: Int
    var left = 0
    var right = masInt.size - 1
    do {
        for (i in left..right-1) {
            if (masInt[i] > masInt[i+1]) {
                buff = masInt[i]
                masInt[i] = masInt[i+1]
                masInt[i+1] = buff
            }
        }
        right--
        for (i in (left+1..right).reversed()) {
            if (masInt[i] < masInt[i-1]) {
                buff = masInt[i]
                masInt[i] = masInt[i-1]
                masInt[i-1] = buff
            }
        }
        left++
    } while (left < right)
}