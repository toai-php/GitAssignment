package com.toai.day1basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button1)

        button.setOnClickListener {
            Toast.makeText(this, "Xin chào", Toast.LENGTH_SHORT).show()
        }
    }

    // issue 3
}