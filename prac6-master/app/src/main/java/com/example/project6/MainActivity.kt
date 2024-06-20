package com.example.project6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1 = findViewById<Button>(R.id.BTN1)
        b1.setOnClickListener {
         Toast.makeText(this,"1",Toast.LENGTH_LONG).show()
        }
        val b2 = findViewById<Button>(R.id.BTN2)
        b1.setOnClickListener {
            Toast.makeText(this,"1",Toast.LENGTH_LONG).show()
        }
        val b3 = findViewById<Button>(R.id.BTN3)
        b1.setOnClickListener {
            Toast.makeText(this,"1",Toast.LENGTH_LONG).show()
        }
        val b4 = findViewById<Button>(R.id.BTN4)
        b1.setOnClickListener {
            Toast.makeText(this,"1",Toast.LENGTH_LONG).show()
        }
        val b5 = findViewById<Button>(R.id.BTN5)
        b1.setOnClickListener {
            Toast.makeText(this,"1",Toast.LENGTH_LONG).show()
        }
        val b6 = findViewById<Button>(R.id.BTN6)
        b1.setOnClickListener {
            Toast.makeText(this,"1",Toast.LENGTH_LONG).show()
        }
        val b7 = findViewById<Button>(R.id.BTN7)
        b1.setOnClickListener {
            Toast.makeText(this,"1",Toast.LENGTH_LONG).show()
        }
        val b8 = findViewById<Button>(R.id.BTN8)
        b1.setOnClickListener {
            Toast.makeText(this,"1",Toast.LENGTH_LONG).show()
        }
        val b9 = findViewById<Button>(R.id.BTN9)
        b1.setOnClickListener {
            Toast.makeText(this,"1",Toast.LENGTH_LONG).show()
        }


    }
}