import java.util.*

fun main() {
    var scan: Scanner = Scanner(System.`in`)

    print("Input Text : ")
    var input: String = scan.nextLine()

    println("Your Text is $input")

    print("Input Number (0~9) : ")
    var strNum: String = scan.nextLine()

    // 입력받고자 하는 대상이 정수인데 문자열로 입력받았으므로 다시 정수형으로 변환
//    var intNum = Integer.valueOf(strNum)

    // 정수가 아닌 값을 입력하면 Integer.valueOf() 에서 exception이 발생
    // 이때 try-catch를 사용하여 exception 처리를 해주어야 한다
    var intNum = 0
    try {
        intNum = Integer.valueOf(strNum)
    } catch (e: NumberFormatException) {
        println("$strNum is not Number")
    }

    println("Your Number is $intNum, ${intNum * intNum}")
}