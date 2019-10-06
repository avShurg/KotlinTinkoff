import ru.tinkoff.*
import java.lang.Exception
import kotlin.IllegalArgumentException

fun main() {
    fun givePetName(): String {
        println("Дайте питомцу имя")
        return readLine() ?: "pet"
    }

    val owner = Owner()
    println("Выберите питомца из списка: cat, dog, fish, parrot, snake")
    loop@ do {
        val str = readLine()
        when (str) {
            "cat" -> {
                owner.pet = Cat(givePetName())
                break@loop
            }
            "dog" -> {
                owner.pet = Dog(givePetName())
                break@loop
            }
            "fish" -> {
                owner.pet = Fish(givePetName())
                break@loop
            }
            "parrot" -> {
                owner.pet = Parrot(givePetName())
                break@loop
            }
            "snake" -> {
                owner.pet = Snake(givePetName())
                break@loop
            }
            else -> println("Питомец должен быть из списка (для выхода наберите 'exit')")
        }
    } while (!str.equals("exit"))

    println("Команды:\n\tfeed - покормить питомца\n\tclean - убрать за питомцем\n\tplay - поиграть с питомцем\n\texit - выйти из игры")
    println("Введите команду:")
    loop@ do {
        val str = readLine()
        if (owner.pet == null) {
            break
        }
        when (str) {
            "feed" -> owner.pet?.feed()
            "clean" -> owner.pet?.cleanUp()
            "play" -> owner.pet?.play()
            "exit" -> {
                println("игра завершена")
                break@loop
            }
            else -> println("неверная команда")
        }
        if (owner.pet?.checkRunAway!!) {
            println("игра завершена")
            break
        }
    } while (!str.equals("exit"))
}
