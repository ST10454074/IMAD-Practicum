package com.example.steptrackerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Find UI elements
        val inputDay = findViewById<EditText>(R.id.inputDay)
        val inputMorningSteps = findViewById<EditText>(R.id.inputMorningSteps)
        val inputAfternoonSteps = findViewById<EditText>(R.id.inputAfternoonSteps)
        val inputNotes = findViewById<EditText>(R.id.inputNotes)

        val clearButton = findViewById<Button>(R.id.clearButton)
        val doneButton = findViewById<Button>(R.id.doneButton)

        // Clear button to reset input fields
        clearButton.setOnClickListener {
            inputDay.text.clear()
            inputMorningSteps.text.clear()
            inputAfternoonSteps.text.clear()
            inputNotes.text.clear()
        }

        // Done button to save data and open the next page
        doneButton.setOnClickListener {
            val day = inputDay.text.toString()
            val morningSteps = inputMorningSteps.text.toString()
            val afternoonSteps = inputAfternoonSteps.text.toString()
            val notes = inputNotes.text.toString()

            // Start new activity and pass data
            val intent = Intent(this, MainActivity3::class.java).apply {

                putExtra("DAY", day)
                putExtra("MORNING_STEPS", morningSteps)
                putExtra("AFTERNOON_STEPS", afternoonSteps)
                putExtra("NOTES", notes)
            }
            startActivity(intent)
        }
    }
}



