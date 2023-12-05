package com.example.dailyhealtheats

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.dailyhealtheats.R
import com.example.dailyhealtheats.register

class login : AppCompatActivity() {
    private lateinit var buttonLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        buttonLogin = findViewById(R.id.L_btn1)

        buttonLogin.setOnClickListener{
            val move = Intent(this@login, home::class.java)
            startActivity(move)
        }
    }

}
