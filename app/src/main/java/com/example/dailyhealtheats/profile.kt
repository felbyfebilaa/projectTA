package com.example.dailyhealtheats

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profile : AppCompatActivity() {
    private lateinit var buttoneditprofile : Button
    private lateinit var buttonlogout : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        buttoneditprofile = findViewById(R.id.p_txt1)
        buttonlogout = findViewById(R.id.p_txt2)

        buttoneditprofile.setOnClickListener{
            val move = Intent(this@profile, edit_profile::class.java)
            startActivity(move)
        }

        buttonlogout.setOnClickListener{
            val move = Intent(this@profile, login::class.java)
            startActivity(move)
        }
    }
}