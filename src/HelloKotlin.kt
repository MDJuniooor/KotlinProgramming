import com.example.edu.Person

fun main() {
    println("Hello Kotlin!")

    val person = Person("Kil dong", 20)
    val person2 = Person(123, "Kil dong", "Programmer")
    println(person)
    println(person.name)
    println(person.age)
}

class Person(val no: Int, val name: String, val job: String)