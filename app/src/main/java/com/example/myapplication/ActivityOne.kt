package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ActivityOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
        Log.d("CICLO", "ActivityOne - onCreate")
    }

    override fun onStart() { super.onStart(); Log.d("CICLO", "ActivityOne - onStart") }
    override fun onResume() { super.onResume(); Log.d("CICLO", "ActivityOne - onResume") }
    override fun onPause() { super.onPause(); Log.d("CICLO", "ActivityOne - onPause") }
    override fun onStop() { super.onStop(); Log.d("CICLO", "ActivityOne - onStop") }
    override fun onDestroy() { super.onDestroy(); Log.d("CICLO", "ActivityOne - onDestroy") }
}