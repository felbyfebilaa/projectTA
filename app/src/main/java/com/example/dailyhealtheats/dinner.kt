package com.example.dailyhealtheats

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class dinner : AppCompatActivity() {
    private lateinit var buttonayamteriyaki : Button
    private lateinit var buttonpusu : Button
    private lateinit var buttonsaladbuah : Button
    private lateinit var buttonpisangyogurt : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dinner)

        buttonayamteriyaki = findViewById(R.id.dn_txt2)
        buttonpusu = findViewById(R.id.dn_txt3)
        buttonsaladbuah = findViewById(R.id.dn_txt4)
        buttonpisangyogurt = findViewById(R.id.dn_txt5)

        buttonayamteriyaki.setOnClickListener{
            val move = Intent(this@dinner, deskripsi_ayamteriyaki::class.java)
            startActivity(move)
        }

        buttonpusu.setOnClickListener{
            val move = Intent(this@dinner, deskripsi_posu::class.java)
            startActivity(move)
        }

        buttonsaladbuah.setOnClickListener{
            val move = Intent(this@dinner, deskripsi_salad::class.java)
            startActivity(move)
        }

        buttonpisangyogurt.setOnClickListener{
            val move = Intent(this@dinner, deskripsi_pisangyogurt::class.java)
            startActivity(move)
        }
    }
}