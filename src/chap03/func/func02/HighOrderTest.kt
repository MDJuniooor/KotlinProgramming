package chap03.func.func02.highorder

fun main() {
    var result: Int

    //일반함수에 람다식 할당
    val multi = {x: Int, y:Int -> x*y}
    //람다식이 할당된 변수는 함수처럼 사용 가능
    result = multi(10, 20)
    println(result)

    val multi2:(Int, Int) -> Int = {x:Int, y:Int ->
        println("x * y")
        x * y
    }

    val multi3: (Int, Int) -> Int = {x:Int, y:Int -> x * y}
    val multi4 = {x: Int, y: Int -> x * y}
    val multi5: (Int, Int) -> Int = {x, y -> x * y}
    // error - val multi6 = {x, y -> x * y}
}

