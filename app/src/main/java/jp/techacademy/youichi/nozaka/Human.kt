package jp.techacademy.youichi.nozaka

import android.util.Log

open class Human: Animal, Thinkable{
    var hobby = ""

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.name = name
        this.age = age
        this.hobby = hobby
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は"  + this.age + "歳です。")
    }

    // Thinkableインタフェースのメソッドをオーバーライド
    override fun think() {
        //Log.d("kotlintest", "私は" + hobby + "について考える。")
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }
}
