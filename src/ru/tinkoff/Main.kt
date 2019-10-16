package ru.tinkoff

fun Pet.isAdult() = this.age >= 2

val Pet.respectableNickname: String
    get() = "Dear ${this.nickname}"

fun Dog.isAdult() = this.age >= 3

val Dog.respectableNickname: String
    get() = "Dear dog ${this.nickname}"

fun printRespectatbleNickname(p: Pet) {
    println("Называйте ${p.nickname} уважительно: ${p.respectableNickname}")
}

fun main() {
    val pet = Pet("Жучка", 2, false)
    println("Животное совершеннолетние? ${pet.isAdult()}")
    println("respectableNickname = ${pet.respectableNickname}")
    val dog = Dog("Тучка", 1, true)
    println("Животное совершеннолетние? ${dog.isAdult()}")
    println("respectableNickname = ${dog.respectableNickname}")
    val cat = Cat("Муся", 4, true)
    /**
     * Т.к. расширения имеют статическую диспетчеризацию,
     * то функция printRespectatbleNickname зависит зависит только от объявленного параметризованного типа p,
     * который является Pet классом и вызовет соответствующее ему расширение (respectableNickname)
     */
    printRespectatbleNickname(pet)
    printRespectatbleNickname(dog)
    val ownerPet = Owner(pet)
    ownerPet.feed()
    ownerPet.pet = cat
    ownerPet.feed()
    ownerPet.pet = dog
    ownerPet.feed()
}