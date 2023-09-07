package com.example.demo.stpack

abstract class AquariumFish {
    abstract val color: String//抽象クラスはコンストラクターある、これをインスタンス化はできない
}
class Shark: AquariumFish(), FishAction {
    override val color = "gray"//抽象クラスを継承、実装必須
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus (): FishAction by PrintingFishAction("eat algae"), FishColor by GoldColor {
//    override val color = "gold"//インターフェース、実装必須,
    //インターフェース委任

//    override fun eat() {
//        println("eat algae")//インターフェース、実装必須
//    }
}

interface FishAction {
    fun eat()//インターフェース
}
interface FishColor {
    val color: String
}
object GoldColor : FishColor {
    override val color = "gold"
}
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}
