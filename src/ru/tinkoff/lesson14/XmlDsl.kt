package ru.tinkoff.lesson14

import ru.tinkoff.lesson14.Tag.Companion.obj

open class Tag(private val name: String) {
    private var field: String = ""
    private val children = mutableListOf<Tag>()

    protected fun <T : Tag> doInit(child: T, init: T.() -> Unit) {
        child.init()
        children.add(child)
    }

    operator fun String.unaryPlus() {
        field = this
    }

    override fun toString() = "<$name>${children.joinToString("", field)}</$name>\n"

    companion object {
        fun obj(init: Object.() -> Unit) = Object("object").apply(init)

        class Object(name: String) : Tag(name) {
            fun name(init: Name.() -> Unit) = doInit(Name(), init)
            fun surname(init: Surname.() -> Unit) = doInit(Surname(), init)
            fun birthDay(init: Birthday.() -> Unit) = doInit(Birthday(), init)
            fun addresses(init: Addresses.() -> Unit) = doInit(Addresses(), init)

            class Addresses : Tag("addresses") {
                fun address(init: Address.() -> Unit) = doInit(Address(), init)
            }

            class Name : Tag("name")
            class Surname : Tag("surname")
            class Birthday : Tag("birthDate")
            class Address : Tag("address")
        }
    }
}

fun main() {
    println(obj {
        name {
            +"Иван"
        }
        surname {
            +"Сидоров"
        }
        birthDay {
            +"06.05.2004"
        }
        addresses {
            address {
                +"г.Москва, ул.Ленина, д.14, кв.5"
            }
            address {
                +"г.Рязань, ул.Свободы, д.53, кв.7"
            }
        }
    })
}