package chap03.func.func01

fun namedParam(x: Int = 100, y:Int = 200, z: Int){
    print(x + y + z)
}

fun normalVarargs(vararg counts: Int){
    for (num in counts){
        println("$num")
    }
    println()
}