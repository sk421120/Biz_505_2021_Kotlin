fun tryCatch(strNum:String): Int {
    var num:Int = 0;
    try {
        num = strNum.toInt()
//        num = Integer.parseInt(strNum)
    } catch (e:NumberFormatException) {
        println("$strNum is Not Number!!")
    }
    return num
}

fun main() {
    println("please input Number 1")
    print(" > ")
    var strnum1: String = scan.nextLine()
    var num1 = tryCatch(strnum1)

    println("please input Number 2")
    print(" > ")
    var strnum2:String = scan.nextLine()
//    var num2 = strnum2.toInt()
    var num2 = tryCatch(strnum2)

    println("$num1 + $num2 = ${num1 + num2}")
    println("$num1 - $num2 = ${num1 - num2}")
    println("$num1 x $num2 = ${num1 * num2}")
    println("$num1 / $num2 = ${num1 / num2}")
}