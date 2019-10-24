package chap03.func.func02

fun main() {

    val res1 = sum(3, 2) // 일반 인자
    val res2 = mul(sum(3, 3), 3) // 인자에 함수를 사용

    println("res1 = $res1, res2 = $res2")
    println("funcfunc = ${funcfunc()}")
}

fun sum(a: Int, b: Int) :Int{
    return a + b
}

fun mul(a: Int, b: Int) = a * b

fun funcfunc(): Int {
    return sum(2,2)
}