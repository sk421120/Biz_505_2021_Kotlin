import java.util.*

fun main() {
    var rnd:Random = Random(System.currentTimeMillis())

    var num:Int = rnd.nextInt(100) + 2
// var num = 7
    /*
    2 ~ 101 까지 범위중 생성된 1개의 난수가 prime 수인지 판별

    2 ~ 자기자신 - 1까지 수 중에서 약수가 없는 수
     */

    var bPrimeYes = true

    for (index in 2 until num) {
        if(num % index == 0) {
            bPrimeYes = !bPrimeYes
            break
        }
    }

    if(bPrimeYes) println("$num is PrimeNumber")
    else println("$num is NOT PrimeNumber")

    bPrimeYes = true
    var index = 2
    while ( index <= num /2) {
        if (num % index++ ==0) break
    }

    if (index > num / 2) println("$num is Prime")
    else println("$num is NOT Prime")


}