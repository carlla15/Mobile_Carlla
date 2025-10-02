package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOne: Button = findViewById(R.id.btnFragmentOne)
        val btnTwo: Button = findViewById(R.id.btnFragmentTwo)
        val btnThree: Button = findViewById(R.id.btnFragmentThree)

        btnOne.setOnClickListener {
            val intent = Intent(this, ActivityOne::class.java)
            startActivity(intent)
        }

        btnTwo.setOnClickListener {
            val intent = Intent(this, ActivityTwo::class.java)
            startActivity(intent)
        }

        btnThree.setOnClickListener {
            val intent = Intent(this, ActivityThree::class.java)
            startActivity(intent)
        }
    }
}