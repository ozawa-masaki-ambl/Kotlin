package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import kotlin.math.PI

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {


	runApplication<DemoApplication>(*args)
	println("Hello, world!")
		// Hello, world!
	// データ型と変数
	studyVariables()
	studyControllFlow()
}

/**
 * Kotlintour
 * データ型と変数
 * 参考にしたURL、解いた問題URLなど
 *
 * https://kotlinlang.org/docs/kotlin-tour-hello-world.html
 * https://kotlinlang.org/docs/kotlin-tour-basic-types.html
 * https://kotlinlang.org/docs/kotlin-tour-collections.html
 */
private fun studyVariables() {
	val name:String="Masa"
	val num = 23
	println("$name is $num years old")
	val green = listOf(1,4,5)
	val red = listOf(33,2)
	val count = green.count()+red.count()
	println(count)
	val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
	val requested = "ftp"
	val isSupported = requested.uppercase()in SUPPORTED
	println("Support for $requested: $isSupported")
	val number2word = mapOf("1" to "A","2" to "B","3" to "C")
	val n = 2
	println("$n is spelt as '${number2word["2"]}'")
}
/*制御フロー
https://kotlinlang.org/docs/kotlin-tour-control-flow.html
 */
private  fun studyControllFlow(){
	val button = "A"
	println(
		when(button) {
			"A" -> "Yes"
			"B" -> "No"
			"X" -> "Menu"
			"Y" -> "Nothing"
			else ->"There is no such button"
		}
	)
	for (number in 1..8){
		println("There's only $number slice/s of pizza :(")
	}
	var pizzaSlices = 1
	while (pizzaSlices < 9){
		println("There's only $pizzaSlices slice/s of pizza :(")
		pizzaSlices++
	}

	for (num in 1..100) {
		if (num % 3 == 0 && num % 5 == 0) {
			println("FizzBuzz")
		} else if (num % 3 == 0) {
			println("Fizz")
		}else if (num % 5 == 0) {
			println("Buzz")
		}else{
			println(num)
		}
	}

	val words = listOf("dinosaur", "limousine", "magazine", "language")
	for (st in words){
		if (st.startsWith("l")){
		println(st)
		}
	}
	fun circleArea(rad:Int):Double = PI*rad*rad

	println( circleArea(2))

	fun intervalInSeconds(hours: Int=0, minutes: Int=0, seconds: Int=0) =
		((hours * 60) + minutes) * 60 + seconds
	println(intervalInSeconds(1, 20, 15))
	println(intervalInSeconds( minutes = 1, seconds = 25))
	println(intervalInSeconds(hours = 2,))
	println(intervalInSeconds( minutes = 10, ))
	println(intervalInSeconds(hours = 1, seconds = 1))

	val actions = listOf("title", "year", "author")
	val prefix = "https://example.com/book-info"
	val id = 5
	val urls = actions.map { action -> "$prefix/$id/$action" }
		println(urls)

	fun repeatN(n: Int, action: () -> Unit) {
		for (i in 1..n){
			action()
		}
	}
	repeatN(5,{ println("Hi") })
}



