package com.example.madlabexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class otpScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_otp_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val backBTN = findViewById<ImageButton>(R.id.backbtn)
        backBTN.setOnClickListener {
            val intent = Intent(this, signUpScreen::class.java)
            startActivity(intent)
        }

        val confirmOTP = findViewById<Button>(R.id.confirmOTPbtn)
        confirmOTP.setOnClickListener {
            val intent = Intent(this, otpConfirmationScreen::class.java)
            startActivity(intent)
        }
    }
}