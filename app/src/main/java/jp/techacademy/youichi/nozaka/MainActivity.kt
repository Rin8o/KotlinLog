package jp.techacademy.youichi.nozaka

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("ノザカ", 34, "Android")      // 名前をノザカ、年齢33歳、趣味Androidで、Humanのインスタンスを作る
        human.say()     // sayメソッドの呼び出し
        human.think()   // thinkメソッドの呼び出し

    }
}