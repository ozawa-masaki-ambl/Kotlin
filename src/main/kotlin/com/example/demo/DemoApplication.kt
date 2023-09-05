package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {


	runApplication<DemoApplication>(*args)
	println("Hello, world!")
		// Hello, world!
	val name:String="Masa"
	val num = 23
	println("$name is $num years old")
	val green = listOf(1,4,5)
	val red = listOf(33,2)
	val count = green.count()+red.count()
	println(count)
	val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
	val requested = "ftp"
	val isSupported = requested.uppercase()in SUPPORTED// Write your code here
		println("Support for $requested: $isSupported")
	val number2word = mapOf("1" to "A","2" to "B","3" to "C")// Write your code here
	val n = 2
	println("$n is spelt as '${number2word["2"]}'")



}
