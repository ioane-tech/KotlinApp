package com.example.quiz1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val emailInput: EditText = findViewById(R.id.email_input)
        val nextButton: Button = findViewById(R.id.button_next)

        nextButton.setOnClickListener{
            val email = emailInput.text.toString()
            val intent = Intent(this, WelcomeEmail::class.java)
            intent.putExtra("USER_EMAIL", email)
            startActivity(intent)
        }

    }
}