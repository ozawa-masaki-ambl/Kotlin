package com.example.demo.stpack.stdate

data class Decoration(val rocks: String) {//データクラスはGUIから作る。
}
fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))
    println (decoration1==decoration2)
    println (decoration3==decoration2)//.equalsと同じ（javaは＝＝でインスタンスが同じか見るKotlinだと＝＝＝）
}

//構造化
data class Decoration2(val rocks: String, val wood: String, val diver: String){
}

fun makeDecorations2() {
    val d5 = Decoration2("crystal", "wood", "diver")//プロパティをまとめて変数に入れる。
    println(d5)

// Assign all properties to variables.
    val (rock, wood, diver) = d5//それぞれに入れる。
    println(rock)
    println(wood)
    println(diver)
}
fun main() {
    makeDecorations()
    makeDecorations2()

}
