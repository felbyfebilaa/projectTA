package com.example.dailyhealtheats

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class register : AppCompatActivity() {
    private lateinit var buttonregister: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        buttonregister=findViewById(R.id.R_btn1)

        buttonregister.setOnClickListener{
            var move = Intent(this@register, login::class.java)
            startActivity(move)
        }
    }

}
