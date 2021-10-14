// 진입점 함수
fun main() {
    var result1 = add(10, 20)
    var result2 = add(10.0f, 20.0f)
    println("$result1, $result2")
}

// 함수를 사용하여 코드 분리하기
// fun 키워드를 사용하여 함수를 정의한다
// fun 함수명( 매개변수:type ) : return type {}

// void method( int a, int b ) {}   : Java
// fun method( a:Int, b:Int ) {}    : Kotlin

// return type 정수형인 함수
// int 함수명( int 매개변수 ) {    }   : Java
// fun 함수명( 매개변수:Int ) : Int { }: Kotlin

/*
함수형 프로그래밍
순수함수 개념
매개변수로 전달받은 값을 변경하지 않고 다른 연산의 기초데이터만 활용하는 함수

java에서 method는 매개변수로 전달받은 변수에 연산을 통하여 값을 변경 가능
단순히 매개변수에 어떤 값을 할당 할 수도 있다

하지만 Kotlin 에서는 매개변수를 절대 변경할 수 없는 규칙이 있다
순수 함수를 유지하기위한 Kotlin 의 정책
 */
fun add(num1:Int, num2:Int):Int {
//    num1 += 10
//    num2 += 20
    var sum = num1 + num2
    return sum
}

fun add(num1:Float, num2:Float):Float {
    var sum = num1 + num2
    return sum
}