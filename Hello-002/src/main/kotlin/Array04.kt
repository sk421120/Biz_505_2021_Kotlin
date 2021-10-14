fun main() {
    var numbers = Array(45, {index -> index+1})

    viewList(numbers)

    // Collection 에 담긴 데이터를 무작위로 섞어주는 함수
    numbers.shuffle()

    println("*".repeat(50))
    viewList(numbers)

    // 0 부터 5번까지 6개를 잘라서 복사
    var lotto = numbers.slice(0..5)
//    viewList(lotto)
    println("*-".repeat(25))
    println("   LUCKY NUMBER")
    println("*-".repeat(25))
    // 잘라내서 복사한 배열을 다시 정렬하여 보여주기
    println(lotto.sorted())
    println("*-".repeat(25))
}

fun viewList(numbers:Array<Int>) {
    for ((index,num) in numbers.withIndex()){
        print("$num ")
        if (index % 10 == 9) println()
    }
    println()
}