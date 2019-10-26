package chap03.func.func02

fun main() {
    noParam ({ "Hello World!" })
    noParam { "Hello World!" } // 소괄호 생략가능

    //매개변수가 하나 있는 람다식 함수
    oneParam { a -> "Hello World! $a"}
    oneParam { "Hello World! $it" } // it으로 대체 가능

    //매개변수가 2개 있는 람다식 함수
    moreParam{a, b -> "Hello World! $a $b"} // 매개변수명 생략 불가
    moreParam{_, b -> "Hello World! $b"} // 매개변수를 생략

    //인자와 함께 사용하는 경우
    withArgs("Arg1", "Arg2", {a, b -> "Hello World $a $b"})
    //마지막 인자가 람다식인 경우 소괄호 바깥으로 분리 가능
    withArgs("Arg1", "Arg2") {a, b -> "Hello World $a $b"}

    // 두 개의 람다식을 가진 함수의 사용
    twoLamba({a, b -> "First $a $b"}, {"Second $it"})
    twoLamba({a, b -> "First $a $b"}){"Second $it"}
}

fun noParam(out: () -> String) = println(out())

fun oneParam(out: (String) -> String){
    println(out("OneParam"))
}

fun moreParam(out: (String, String) -> String){
    println(out("OneParam", "TwoParam"))
}

fun withArgs(a: String, b: String, out: (String, String) -> String){
    println(out(a, b))
}

fun twoLamba(first: (String, String) -> String, second: (String) -> String){
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}