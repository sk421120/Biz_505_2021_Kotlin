import java.util.*

fun main() {
    var scan:Scanner = Scanner(System.`in`)

    println("반지름을 입력하시오 (정수형) : ")
    var strInput = scan.nextLine()

    var radius:Int? = null

    try {
        radius = Integer.valueOf(strInput)
    } catch (e:NumberFormatException){
        println("잘못된 입력값입니다")
        return
    }

    if(radius != null && radius != 0) circle(radius)
    else println("ByeBye")
}

// 원의 둘레    : 반지름 * 2 * PI
// 원의 면적    : 반지름 * 반지름 * PI

// 구의 표면적   : 반지름 * 반지름 * 4 * PI
// 구의 부피    : 반지름 * 반지름 * 반지름 * PI * (4/3)
fun circle(radius:Int) {
    var pi = Math.PI
    var rad = radius.toDouble()
    println("원의 둘레는   ${rad * 2 * pi}")
    println("원의 면적은   ${rad * rad * pi}")
    println("구의 표면적은 ${rad * rad * 4 * pi}")
    println("구의 부피는   ${rad * rad * rad * pi * (4/3)}")
}