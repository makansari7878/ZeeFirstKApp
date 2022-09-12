package com.example.zeefirstkapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("mytag", "Second Activty onCreated Method")

//        var resTextView = findViewById<TextView>(R.id.textViewSecondResult)
//
//       var res =  intent.extras?.getString("keyun")
//
//        resTextView.setText(res)
//
//        resTextView.setOnClickListener {
//            var i = Intent(this, MainActivity::class.java)
//            startActivity(i)
//        }
    }


    override fun onStart() {
        super.onStart()
        Log.d("mytag", "Second Activty onStart Method")
    }

    override fun onResume() {
        super.onResume()

        Log.w("mytag", "Second Activty onResume Method")
    }

    override fun onPause() {
        super.onPause()

        Log.i("mytag", " Second Activty onPause Method")
    }

    override fun onStop() {
        super.onStop()
        Log.i("mytag", "Second Activty onStop Method")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("mytag", "Second Activty onDestroy Method")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("mytag", "Second Activty onReStart Method")
    }
}