package ru.tinkoff

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PetTest {

    @Test
    fun getCheckRunAway() {
        val pet = Cat("asd")
        assertEquals(pet.checkRunAway, false)
    }

    @Test
    fun feed() {
        val pet = Cat("asd")
        pet.feed()
        pet.feed()
        assertEquals(pet.checkRunAway, true)
    }

    @Test
    fun cleanUp() {
        val pet = Cat("asd")
        pet.feed()
        pet.cleanUp()
        assertEquals(pet.checkRunAway, false)
    }
}