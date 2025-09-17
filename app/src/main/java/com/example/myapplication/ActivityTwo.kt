package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ActivityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
        Log.d("CICLO", "ActivityTwo - onCreate")
    }

    override fun onStart() { super.onStart(); Log.d("CICLO", "ActivityTwo - onStart") }
    override fun onResume() { super.onResume(); Log.d("CICLO", "ActivityTwo - onResume") }
    override fun onPause() { super.onPause(); Log.d("CICLO", "ActivityTwo - onPause") }
    override fun onStop() { super.onStop(); Log.d("CICLO", "ActivityTwo - onStop") }
    override fun onDestroy() { super.onDestroy(); Log.d("CICLO", "ActivityTwo - onDestroy") }
}