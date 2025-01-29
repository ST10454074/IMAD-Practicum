package com.example.steptrackerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        // Find UI elements
        val outputDay = findViewById<TextView>(R.id.outputDay)
        val outputMorningSteps = findViewById<TextView>(R.id.outputMorningSteps)
        val outputAfternoonSteps = findViewById<TextView>(R.id.outputAfternoonSteps)
        val outputNotes = findViewById<TextView>(R.id.outputNotes)
        val outputAverageSteps = findViewById<TextView>(R.id.outputAverageSteps)

        val highestStepsButton = findViewById<Button>(R.id.highestStepsButton)
        val backButton = findViewById<Button>(R.id.backButton)

        // Retrieve data from intent
        val day = intent.getStringExtra("DAY")
        val morningSteps = intent.getStringExtra("MORNING_STEPS")?.toIntOrNull() ?: 0
        val afternoonSteps = intent.getStringExtra("AFTERNOON_STEPS")?.toIntOrNull() ?: 0
        val notes = intent.getStringExtra("NOTES") ?: "No notes available"

        // Calculate the average steps
        val averageSteps = (morningSteps + afternoonSteps) / 2

        // Display the details
        outputDay.text = day
        outputMorningSteps.text = morningSteps.toString()
        outputAfternoonSteps.text = afternoonSteps.toString()
        outputNotes.text = notes
        outputAverageSteps.text = averageSteps.toString()

        // Back Button - Go to previous activity
        backButton.setOnClickListener {
            finish()
        }

        // Highest Steps Button - Placeholder action (modify if storing multiple days)
        highestStepsButton.setOnClickListener {
            val intent = Intent(this, HighestStepsActivity::class.java)
            startActivity(intent)
        }
    }
}







    }
}
