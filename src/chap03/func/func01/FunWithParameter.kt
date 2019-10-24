package chap03.func.func01

fun add(name: String, email: String = "default"){
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
}

fun defaultArgs(x: Int = 100, y:Int = 200){
    println(x + y)
}