import java.util.*

val scan = Scanner(System.`in`)
fun main(args: Array<String>) {
    val s = scan.next()
    print(isCapitalized(s))
}

fun isCapitalized(str: String) = (str != "" && str[0].isUpperCase())