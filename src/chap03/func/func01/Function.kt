package chap03.func.func01

fun main() { // 최초 스택 프레임
    val result1 = sum1(3, 2) // 임시변수 혹 지역변수, 두번째 스택 프레임
    val result2 = sum2(5, 7) // 세번째 스택 프레임

    println(result1)
    println(result2)

    // FunWithParameter Test
    add("홍길동")
    add("둘리", "dooly@example.kr")
    defaultArgs()
    defaultArgs(200)

    // NamedParam Test
    normalVarargs(2, 3, 4, 5, 6)
    normalVarargs(3, 4, 6, 7)

}

// 간소화된 function
fun sum1(a: Int, b: Int): Int = a + b // a, b는 sum1의 임시 변수
fun sum2(a: Int, b: Int) = a + b
