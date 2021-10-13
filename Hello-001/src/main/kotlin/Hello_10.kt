fun main() {
    println("please input Number 1")
    print(" > ")
    var strnum1: String = scan.nextLine()
    var num1 = 0;
    try {
        num1 = strnum1.toInt()
    }catch (e:NumberFormatException) {
        println("Not Number : ${strnum1}")
        return
    }

    println("please input Number 2")
    print(" > ")
    var strnum2: String = scan.nextLine()
    var num2 = 0;
    try {
        num2 = strnum2.toInt()
    }catch (e:NumberFormatException) {
        println("Not Number : ${strnum2}")
        return
    }

    if ( num1 != 0 && num2 != 0) {
        println("$num1 + $num2 = ${num1 + num2}")
        println("$num1 - $num2 = ${num1 - num2}")
        println("$num1 x $num2 = ${num1 * num2}")
        println("$num1 / $num2 = ${num1 / num2}")
    } else {
        println("NUMBER ERROR")
    }
}