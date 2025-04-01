package com.example.madlabexam2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class homePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val test = findViewById<ConstraintLayout>(R.id.bus1)
        test.setOnClickListener {
            val intent = Intent(this, seatSelectingScreen::class.java)
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

        val profilebtn = findViewById<ImageButton>(R.id.profilebtn)
        profilebtn.setOnClickListener {
            val intent = Intent(this, profileScreen::class.java)
            startActivity(intent)
        }
    }
}