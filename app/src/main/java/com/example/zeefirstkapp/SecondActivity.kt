package com.example.zeefirstkapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var resTextView = findViewById<TextView>(R.id.textViewSecondResult)

       var res =  intent.extras?.getString("keyun")

        resTextView.setText(res)
    }
}