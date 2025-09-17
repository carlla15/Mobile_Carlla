package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ActivityThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
        Log.d("CICLO", "ActivityThree - onCreate")
    }

    override fun onStart() { super.onStart(); Log.d("CICLO", "ActivityThree - onStart") }
    override fun onResume() { super.onResume(); Log.d("CICLO", "ActivityThree - onResume") }
    override fun onPause() { super.onPause(); Log.d("CICLO", "ActivityThree - onPause") }
    override fun onStop() { super.onStop(); Log.d("CICLO", "ActivityThree - onStop") }
    override fun onDestroy() { super.onDestroy(); Log.d("CICLO", "ActivityThree - onDestroy") }
}