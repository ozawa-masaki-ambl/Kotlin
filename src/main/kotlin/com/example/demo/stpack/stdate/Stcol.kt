package com.example.demo.stpack.stdate

/**
 * コレクション操作
 */
    fun main(){
        val aList = listOf("Apple","Banana","Cherry")
        println(aList)
        var bList = mutableListOf(1,2,3,4,5)
        println(bList)
        println(aList[2])//indexで呼ぶ
        var aSet = setOf("Apple","Banana","Cherry")
        println(aSet)
        var aMap = mapOf("1" to "Apple","2" to "Banana","3" to "Cherry")
        println(aMap)
        println(aMap["3"])//キーで呼ぶ

        aList.forEach { aList -> println(aList) }//繰り返し処理（ラムダ式）
        var aReverse = aList.map { aList -> aList.reversed() }//中身を処理
        println(aReverse)

        val people = listOf(
            Person("a",22),
            Person("b",33),
            Person("c",44),
            Person("d",11),
            Cyborg("e",),
        )
//        val filp = people.filter { it.age<=23 }//filter Notだと逆
//        println(filp)
//        println( people.partition { it.age>24 })
        println(people.filterNotNull())//nullかどうか見る
        println(people.filterIsInstance<Cyborg>())//インスタンスの種類で分けれる。
        println(people.take(2))//前からn個をとる。takeLastは後ろから
        println(people.drop(2))//前からn個けしてとる。dropLastは後ろから
        println(people.sumOf { it.age })//Intの合計
        bList.add(1)//一番後ろに追加、addAllだと最初にインデックス指定できる
        bList += 2 //＋＝でも追加、コレクションも末尾に追加できる
        println(bList)
        bList.remove(3)//前から探して消す
        println(bList)
        bList-=1//-=でも削除できる、要素だと前から一つ
        println(bList)
        bList-= listOf(2)//コレクションだと該当するすべての要素消える
        println(bList)
        bList.clear()//全部消える
        println(bList)
    }
open class Person (open val name:String, var age : Int){
    override fun toString(): String {//オーバーライドしないとオブジェクトの文字列になる
        return name
    }
}
class Cyborg(override val name:String) :Person(name, age = 99){
}

