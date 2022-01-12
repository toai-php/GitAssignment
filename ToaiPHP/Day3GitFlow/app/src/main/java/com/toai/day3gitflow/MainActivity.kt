package com.toai.day3gitflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Fibonacci(n : Int, flag: Boolean) : Int {
        if(!flag) {
            var a1 = 1
            var a2 = 1
            if(n == 1 || n == 2) return 1;
            var a = 0
            for(i in 3..n) {
                a = a1+a2
                a1 = a2
                a2 = a
            }
            return a;
        }
        return 0
    }
}