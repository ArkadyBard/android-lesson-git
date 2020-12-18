package com.arkadybardamov.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/**
 * Основная активность
 * добавил обработчик кнопки
 *
 * */

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_1 = findViewById<Button>(R.id.btn_1)
        val textView_1 = findViewById<TextView>(R.id.tv_1)

        button_1.setOnClickListener {
            textView_1.text = getString(R.string.hello_string)
        }

    }
}