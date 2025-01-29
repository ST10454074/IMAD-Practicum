package com.example.steptrackerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find UI elements
        val exitButton = findViewById<Button>(R.id.exitButton)
        val startButton = findViewById<Button>(R.id.startButton)
        val textView = findViewById<TextView>(R.id.textView)
        val logoImage = findViewById<ImageView>(R.id.logoImage)

        // Exit Button Click: Close App
        exitButton.setOnClickListener {
            finishAffinity() // Close the app
        }

        // Start Button Click: Open another activity (if needed)
        startButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

}




