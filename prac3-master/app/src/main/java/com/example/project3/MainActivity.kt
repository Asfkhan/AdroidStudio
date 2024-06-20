package com.example.project3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        print("onStart")
    }

    override fun onPause() {
        super.onPause()
        print("onPause")
    }

    override fun onResume() {
        super.onResume()
        print("onResume")
    }

    override fun onRestart() {
        super.onRestart()
        print("onRestart")
    }

    override fun onStop() {
        super.onStop()
        print("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        print("onDestroy")
    }

    fun print(mag: String) {
        Log.d("Activity State",mag)
    }
}

