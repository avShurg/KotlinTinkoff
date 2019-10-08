import ru.tinkoff.Person
import ru.tinkoff.PersonComparator

fun main() {
    val personAndrewSh = Person("Шурганов", "Андрей", 25, 390000, "89521299918")
    val personDenisP = Person("Петров", "Денис", 23, 390001, "89537363214")
    val personDenisP2 = Person("Петров", "Денис", 23, 390001, "89537363214")
    println(
        if (personAndrewSh.equals(personDenisP)) "${personAndrewSh.firstName} идентичен ${personDenisP.firstName}"
        else "${personAndrewSh.firstName} не идентичен ${personDenisP.firstName}"
    )
    println(
        if (personAndrewSh.equals(personDenisP2)) "${personAndrewSh.firstName} идентичен ${personDenisP2.firstName}"
        else "${personAndrewSh.firstName} не идентичен ${personDenisP2.firstName}"
    )
    println(
        if (personDenisP.equals(personDenisP2)) "${personDenisP.firstName} идентичен ${personDenisP2.firstName}"
        else "${personDenisP.firstName} не идентичен ${personDenisP2.firstName}"
    )
    println("${personDenisP.age} compare ${personAndrewSh.age} result = ${Person.compare(personDenisP, personAndrewSh)}")
    println("${personAndrewSh.age} compare ${personDenisP2.age} result = ${Person.compare(personAndrewSh, personDenisP2)}")
    println("${personDenisP.age} compare ${personDenisP2.age} result = ${Person.compare(personDenisP, personDenisP2)}")
    println("${personDenisP.age} compare ${personAndrewSh.age} result = ${PersonComparator.compare(personDenisP, personAndrewSh)}")
    println("${personAndrewSh.age} compare ${personDenisP2.age} result = ${PersonComparator.compare(personAndrewSh, personDenisP2)}")
    println("${personDenisP.age} compare ${personDenisP2.age} result = ${PersonComparator.compare(personDenisP, personDenisP2)}")
}