import kotlin.random.Random

fun main() {
    var num1 = Random.nextInt(100)
    var bYes = num1 % 2 == 0

    if(bYes) {
        println("$num1 is even")
    } else {
        println("$num1 is not even")
    }

    var result = ""
    if (bYes){
        result = "even"
    } else {
        result = "not even"
    }

    println("$num1 is $result")

    // result2 = bYes ? "even" : "not even"
    var result2 = if (bYes) "even" else "not even"
    println("$num1 is $result2")
}