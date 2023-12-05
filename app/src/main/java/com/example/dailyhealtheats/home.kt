package com.example.dailyhealtheats

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class home : AppCompatActivity() {
    private lateinit var buttonprofile : ImageView
    private lateinit var buttonbreakfast : Button
    private lateinit var buttonlunch : Button
    private lateinit var buttondinner : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        buttonprofile = findViewById(R.id.profile)
        buttonbreakfast = findViewById(R.id.home_txt2)
        buttonlunch = findViewById(R.id.home_txt3)
        buttondinner = findViewById(R.id.home_txt4)

        buttonprofile.setOnClickListener{
            val move = Intent(this@home, profile::class.java)
            startActivity(move)
        }

        buttonbreakfast.setOnClickListener{
            val move = Intent(this@home, breakfast::class.java)
            startActivity(move)
        }
        buttonlunch.setOnClickListener{
            val move = Intent(this@home, lunch::class.java)
            startActivity(move)
        }
        buttondinner.setOnClickListener{
            val move = Intent(this@home, dinner::class.java)
            startActivity(move)
        }
    }
}
