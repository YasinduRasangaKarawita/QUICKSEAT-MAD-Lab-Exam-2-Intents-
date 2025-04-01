package com.example.madlabexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class completedBookings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_completed_bookings)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val backbtn = findViewById<ImageButton>(R.id.backbtn)
        backbtn.setOnClickListener {
            val intent = Intent(this, profileScreen::class.java)
            startActivity(intent)
        }

        val activebtn = findViewById<Button>(R.id.activebtn)
        activebtn.setOnClickListener {
            val intent = Intent(this, activeBookings::class.java)
            startActivity(intent)
        }

        val cancelledbtn = findViewById<Button>(R.id.cancelledbtn)
        cancelledbtn.setOnClickListener {
            val intent = Intent(this, cancelledBookings::class.java)
            startActivity(intent)
        }
    }
}