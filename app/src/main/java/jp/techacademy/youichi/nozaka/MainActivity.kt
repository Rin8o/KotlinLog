package jp.techacademy.youichi.nozaka

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("A",1)
        human1.say()     // sayメソッドの呼び出し

        val human2 = Human("B")
        human2.think()   // thinkメソッドの呼び出し
    }
}