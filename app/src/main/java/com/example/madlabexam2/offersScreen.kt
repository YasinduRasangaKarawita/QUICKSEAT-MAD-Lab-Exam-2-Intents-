package com.example.madlabexam2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class offersScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_offers_screen)
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

        val profilebtn = findViewById<ImageButton>(R.id.profilebtn)
        profilebtn.setOnClickListener {
            val intent = Intent(this, profileScreen::class.java)
            startActivity(intent)
        }
    }
}