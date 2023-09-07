package com.example.demo

import kotlin.random.Random

/**
 * クラス
 * https://kotlinlang.org/docs/kotlin-tour-classes.html
 */
//演習1
data class Employee(val name:String,var salaly:Int)
//演習2
class RandomEmployeeGenerator(var min :Int,var max :Int){
    var names= listOf("mm","ka","sda","kad", "ok")
    fun generateEmployee()=Employee(names.random(),Random.nextInt(from = min, until =  max))
}

/**
 * null safety
 * https://kotlinlang.org/docs/kotlin-tour-null-safety.html
 */
//演習1
fun employeeById(id: Int) = when(id) {
    1 -> Employee("Mary", 20)
    2 -> null
    3 -> Employee("John", 21)
    4 -> Employee("Ann", 23)
    else -> null
}

fun salaryById(id: Int) = employeeById(id)?.salaly ?: 0

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.min = 50
    empGen.max = 100
    println(empGen.generateEmployee())

    println((1..5).sumOf { id -> salaryById(id) })
}
