package com.toai.day3gitflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Fibonacci(n : Int, flag: Boolean) : Int {
        if(flag) {
            if(n == 1 || n == 2) return 1;
            return Fibonacci(n-1, true) + Fibonacci(n-2, true);
        }
        return 0;
    }
}