package com.example.zeefirstkapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
        //setContentView(R.layout.canvas_sheet)
        Log.i("mytag", "onCreate Method")

        var submitButton = findViewById<Button>(R.id.buttonSubmit)
        var usernameTextView = findViewById<TextView>(R.id.textViewUsername )
        var usernameEditText = findViewById<EditText>(R.id.editTextUsername)

        submitButton.setOnClickListener {
          /* var username = usernameEditText.text.toString()
            Toast.makeText(this,"username is $username", Toast.LENGTH_LONG).show()
            usernameTextView.setText(username)

            var myIntent = Intent(this,SecondActivity::class.java)
            myIntent.putExtra("keyun", username)
            startActivity(myIntent)*/

          /*  var i = Intent("shub")
            startActivity(i)*/

          /*  var i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:9676565544"))
            startActivity(i)*/

            var i = Intent(Intent.ACTION_VIEW, Uri.parse("https://yahoo.com"))
            startActivity(i)


        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("mytag", "onStart Method")
    }

    override fun onResume() {
        super.onResume()

        Log.w("mytag", "onResume Method")
    }

    override fun onPause() {
        super.onPause()

        Log.i("mytag", "onPause Method")
    }

    override fun onStop() {
        super.onStop()
        Log.i("mytag", "onStop Method")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("mytag", "onDestroy Method")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("mytag", "onReStart Method")
    }
}













