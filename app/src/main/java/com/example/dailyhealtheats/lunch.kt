package com.example.dailyhealtheats

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class lunch : AppCompatActivity() {
    private lateinit var buttoncapcay : Button
    private lateinit var buttonchickensteak : Button
    private lateinit var buttonsayurasem : Button
    private lateinit var buttonsetaktempe : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lunch)

        buttoncapcay = findViewById(R.id.lc_txt2)
        buttonchickensteak = findViewById(R.id.lc_txt4)
        buttonsayurasem = findViewById(R.id.lc_txt3)
        buttonsetaktempe = findViewById(R.id.lc_txt5)

        buttoncapcay.setOnClickListener{
            val move = Intent(this@lunch, deskripsi_capcay::class.java)
            startActivity(move)
        }

        buttonchickensteak.setOnClickListener{
            val move = Intent(this@lunch, deskripsi_chickensteak::class.java)
            startActivity(move)
        }

        buttonsayurasem.setOnClickListener{
            val move = Intent(this@lunch, deskripsi_sayurasem::class.java)
            startActivity(move)
        }

        buttonsetaktempe.setOnClickListener{
            val move = Intent(this@lunch, deskripsi_steaktempe::class.java)
            startActivity(move)
        }
    }
}