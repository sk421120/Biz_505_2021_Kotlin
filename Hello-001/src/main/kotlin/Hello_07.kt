import java.util.*

// public 선언변수는 프로젝트 전체에 공용으로 사용되므로
// 프로젝트 전체에 유일한 이름이여야 한다

// public 변수로 scan을 선언
// type java.util.Scanner clss
// 전형적인 클래스를 가져와서 객체로 선언 및 생성하기
// 생성자를 new 키워드 없이 그냥 호출하여 객체를 초기화 한다
val scan: Scanner = Scanner(System.`in`)

fun main() {
//    print("String input : ")
//    var input:String = scan.nextLine()
//    println("String is $input")
    /*
    키보드를 사용하여 2개의 문자열형 숫자를 입력 받고
    두 숫자의 사칙연산을 수행하여 console에 표시하시오
     */
    println("please input Number 1")
    print(" > ")
    var strnum1: String = scan.nextLine()
//    str2?:

    var num1 = strnum1.toInt()


    println("please input Number 2")
    print(" > ")
    var strnum2: String = scan.nextLine()
    var num2 = strnum2.toInt()

    println("$num1 + $num2 = ${num1 + num2}")
    println("$num1 - $num2 = ${num1 - num2}")
    println("$num1 x $num2 = ${num1 * num2}")
    println("$num1 / $num2 = ${num1 / num2}")
}