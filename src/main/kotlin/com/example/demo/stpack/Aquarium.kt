package com.example.demo.stpack

/**
 * オブジェクト指向、
 *https://developer.android.com/codelabs/kotlin-bootcamp-classes#0
 */
open class Aquarium(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {//水槽のオブジェクトを作る設計図
//    var width:Int=20//プロパティはクラスの特性
//    var height:Int=40
//    var length:Int=100
    constructor(numberOfFish: Int) : this() {
    // this()でプライマリコンストラクタを呼び出す。
    val tank = numberOfFish * 2000 * 1.1
    height = (tank / (length * width)).toInt()
    }
    init {
        println("aquarium initializing")//初期化
    }
//    init {
//        println("Volume: ${width * length * height / 1000} l")//初期化
//    }
    open var volume: Int
        get() = width * height * length / 1000  // getter
        set(value) {
        height = (value * 1000) / (width * length)}//setter
    open val shape = "rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9

    fun printSize() {
        println(shape)
        println("Width: $width　cm　"+
                "Length: $length cm　"+
                "Height: $height cm")
        println("Volume: $volume l Water: $water l (${water / volume * 100.0}% full)")

    }


}
