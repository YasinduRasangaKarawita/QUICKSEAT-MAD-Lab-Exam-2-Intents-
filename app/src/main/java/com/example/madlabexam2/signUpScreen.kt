package com.example.madlabexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class signUpScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val googlebtn = findViewById<Button>(R.id.googleButton)
        googlebtn.setOnClickListener {
            val intent = Intent(this, otpScreen::class.java)
            startActivity(intent)
        }

        val facebookbtn = findViewById<Button>(R.id.facebookButton)
        facebookbtn.setOnClickListener {
            val intent = Intent(this, otpScreen::class.java)
            startActivity(intent)
        }

        val applebtn = findViewById<Button>(R.id.appleButton)
        applebtn.setOnClickListener {
            val intent = Intent(this, otpScreen::class.java)
            startActivity(intent)
        }
    }
}