package com.example.zeefirstkapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
        //setContentView(R.layout.canvas_sheet)

        var submitButton = findViewById<Button>(R.id.buttonSubmit)
        var usernameTextView = findViewById<TextView>(R.id.textViewUsername )
        var usernameEditText = findViewById<EditText>(R.id.editTextUsername)

        submitButton.setOnClickListener {
           var username = usernameEditText.text.toString()
            Toast.makeText(this,"username is $username", Toast.LENGTH_LONG).show()
            usernameTextView.setText(username)

            var myIntent = Intent(this,SecondActivity::class.java)
            myIntent.putExtra("keyun", username)
            startActivity(myIntent)
        }
    }
}













