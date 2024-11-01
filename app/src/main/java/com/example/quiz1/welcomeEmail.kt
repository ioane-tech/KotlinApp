package com.example.quiz1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class WelcomeEmail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_email)

        val email = intent.getStringExtra("USER_EMAIL")
        val welcomeText: TextView = findViewById(R.id.welcome_text)

        val counterText: TextView = findViewById(R.id.counter_text_view)
        val clickButton: Button = findViewById(R.id.button_click)

        welcomeText.text = "Welcome, $email"

        clickButton.setOnClickListener{
            val counterTextValue = counterText.text.toString().toIntOrNull() ?: 0

            counterText.text = (counterTextValue + 1).toString()
        }
    }
}