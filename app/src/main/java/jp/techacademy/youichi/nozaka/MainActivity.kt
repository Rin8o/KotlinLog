package jp.techacademy.youichi.nozaka

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var human1 = Human("ノザカ",33)
        human1.say()    // sayメソッドの呼び出し
        human1 = Human("Android")
        human1.think()  // thinkメソッドの呼び出し

        var human2 = Human("スズキ",30)
        human2.say()    // sayメソッドの呼び出し
        human2 = Human("iOS")
        human2.think()  // thinkメソッドの呼び出し
    }
}