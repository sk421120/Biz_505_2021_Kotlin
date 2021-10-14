fun main() {

//    key 와 value 를 쌍으로 갖는 데이터 타입
    val map1 = mapOf(
        "name" to "corgi", "tel" to "123-456", "addr" to "home"
    )

    println(map1["name"])
    for ((key, value) in map1) {
        println("key : $key, value : $value")
    }

//    가변형 map
    val map2 = mutableMapOf("name" to "nadona",
        "tel" to "456-789", "addr" to "coding")
    println(map2)
    map2["tel"] = "123-456-7890"
    println(map2)
}