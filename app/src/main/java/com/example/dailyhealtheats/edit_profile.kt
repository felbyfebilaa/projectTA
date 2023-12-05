package com.example.dailyhealtheats

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class edit_profile : AppCompatActivity() {
    private lateinit var buttonedit : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        buttonedit = findViewById(R.id.ed_btn)

        buttonedit.setOnClickListener{
            val move = Intent(this@edit_profile, profile::class.java)
            startActivity(move)
        }
    }
}