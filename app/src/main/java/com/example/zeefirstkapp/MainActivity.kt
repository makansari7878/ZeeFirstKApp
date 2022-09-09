package com.example.zeefirstkapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
        //setContentView(R.layout.canvas_sheet)

        var submitButton = findViewById<Button>(R.id.buttonSubmit)

        submitButton.setOnClickListener {
            Toast.makeText(this,"BUTTON IS CIVCKED", Toast.LENGTH_LONG).show()
        }
    }
}