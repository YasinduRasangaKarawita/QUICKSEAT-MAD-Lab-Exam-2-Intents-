package com.example.madlabexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profileScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val backbtn = findViewById<ImageButton>(R.id.backbtn)
        backbtn.setOnClickListener {
            val intent = Intent(this, homePage::class.java)
            startActivity(intent)
        }

        val homebtn = findViewById<ImageButton>(R.id.homebtn)
        homebtn.setOnClickListener {
            val intent = Intent(this, homePage::class.java)
            startActivity(intent)
        }

        val searchbtn = findViewById<ImageButton>(R.id.searchbtn)
        searchbtn.setOnClickListener {
            val intent = Intent(this, searchScreen::class.java)
            startActivity(intent)
        }

        val offersbtn = findViewById<ImageButton>(R.id.offerbtn)
        offersbtn.setOnClickListener {
            val intent = Intent(this, offersScreen::class.java)
            startActivity(intent)
        }

        val booking = findViewById<Button>(R.id.bookingsbtn)
        booking.setOnClickListener {
            val intent = Intent(this, activeBookings::class.java)
            startActivity(intent)
        }
    }
}