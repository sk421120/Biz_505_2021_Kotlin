import java.util.*

var rnd: Random = Random(System.currentTimeMillis())

fun main() {
    var scan:Scanner = Scanner(System.`in`)
    var input:String = ""
    while (!input.equals("e")) {
        prime()

        println("Next Number? (exit : e)")
        input = scan.nextLine()
    }
    println("ByeBye")
}

fun prime() {

    var num1: Int = rnd.nextInt(99) +1

    println("Random Number is $num1")

//    range 데이터(일종의 유사배열)
    var resultArray =
//        filter를 사용하여 num1값과 % 연산을 하여 결과가 0인 친구들만 추출하여 array에 담아라
    (2 until num1).filter { num1 % it == 0 }

    println(resultArray)

    if (resultArray.isEmpty()) println("$num1 is Prime")
    else println("$num1 is NOT Prime")
}