/*
숫자를 다루는 코드에서 어떤 값이 0이 아닌경우에만 처리하는 코드가 있고
0인 경우에만 처리해야 하는 코드가 있다
    이때는 변수에 담긴 값이 null인가를 검사하여 코드를 실행할지 말지를 결정해야 한다
    이때는 변수에 null을 허용해야 한다
    변수:타입? = null 처럼 null로 초기화된 변수를 선언한다
 */

fun main() {
    println("please input Number 1")
    print(" > ")
    var strnum1: String = scan.nextLine()

    // num1을 Int형으로 선언하고 null을 제한적으로 허용
    /*
    3항 연산 try
    Integer.valueOf(strnum1) 실행이 정상적으로 종료되면 연산 결과가 num1에 담기고
    Exception이 발생하면 println() 실행되어 메시지를 출력한 후 null 값이 num1에 담기게 된다
     */
    var num1: Int? = try {
        strnum1.toInt() // return 이 있는 것처럼 행동
    } catch (e: NumberFormatException) {
        println("Not Number : ${strnum1}")
        null
    }

    println("please input Number 2")
    print(" > ")
    var strnum2: String = scan.nextLine()
    var num2: Int? = try {
        strnum2.toInt()
    } catch (e: NumberFormatException) {
        println("Not Number : ${strnum2}")
        null
    }

    if (num1 != null && num2 != null) {
        println("$num1 + $num2 = ${num1 + num2}")
        println("$num1 - $num2 = ${num1 - num2}")
        println("$num1 x $num2 = ${num1 * num2}")
        println("$num1 / $num2 = ${num1 / num2}")
    } else {
        println("NUMBER ERROR")
    }
}