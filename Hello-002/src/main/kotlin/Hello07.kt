import java.util.*

fun main() {
    var scan:Scanner = Scanner(System.`in`)

    /*
    키보드에서 정수값을 입력받아 입력한 정수가 3의 배수인지를 판별하는 코드 작성
     */

    print("Input Number : ")
    var strNum: String = scan.nextLine()

    var intNum:Int? = null
    try {
        intNum = Integer.valueOf(strNum)
    } catch (e: NumberFormatException) {
        println("$strNum is not Number")
    }

    if(intNum != null  && intNum !=0){
        if (intNum % 3 == 0){
            println("$intNum % 3 = 0")
        } else println("$intNum % 3 != 0")
    } else println("Your Number is $intNum")


}