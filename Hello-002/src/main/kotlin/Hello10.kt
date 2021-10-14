fun main() {

    var num1 = rnd.nextInt(100)

    when(num1 % 2){
        0-> println("$num1 is even")
        1-> println("$num1 is odd")
    }

    var result = when(num1 % 3 ) {
        0->"$num1 % 3 == 0"
        1->"$num1 % 3 == 1"
        2->"$num1 % 3 == 2"
        else->"what?"
    }

    println(result)
}