package com.example.demo.stpack

fun buildAquarium(){
    val  myAquarium = Aquarium() //一つのmyAquariumというオブジェクトを作った
    myAquarium.printSize()//メソッド呼び出し
//    myAquarium.height = 60//プロパティ変更
//    myAquarium.printSize()
//    val aquarium2 = Aquarium(width = 25)
//    aquarium2.printSize()
//    val aquarium3 = Aquarium(height = 35, length = 110)
//    aquarium3.printSize()
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()
    //プロパティをコンストラクタで指定
//    val aquarium6 = Aquarium(numberOfFish = 29)
//    aquarium6.printSize()
//    aquarium6.volume = 70
//    aquarium6.printSize()
//    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} l")getterでできる
    val myTower = TowerTank(diameter = 25, height = 40,)
    myTower.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}
fun main() {
//    buildAquarium()
    makeFish()

}