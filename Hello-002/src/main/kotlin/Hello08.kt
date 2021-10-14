import java.util.*

fun main() {
    var scan:Scanner = Scanner(System.`in`)

    while (true){
        print("Input Number (exit : e) : ")
        var strNum = scan.nextLine()

        if (strNum.equals("e")) break

        var intNum = try {
            Integer.valueOf(strNum)
        } catch (e:NumberFormatException) {
            println("$strNum is Not Number")
            println("Please try again\n")
            continue
        }

        if (intNum % 3 == 0) println("$intNum % 3 = 0")
        else println("$intNum % 3 != 0")
    }
    println("byebye")
}