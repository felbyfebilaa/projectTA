package com.example.dailyhealtheats

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class breakfast : AppCompatActivity() {

    private lateinit var buttonsup : Button
    private lateinit var buttontlurrebus : Button
    private lateinit var buttonomelet : Button
    private lateinit var buttonkaijo : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breakfast)
        buttonsup = findViewById(R.id.bf_txt2)
        buttontlurrebus = findViewById(R.id.bf_txt3)
        buttonomelet = findViewById(R.id.bf_txt4)
        buttonkaijo = findViewById(R.id.bf_txt5)

        buttonsup.setOnClickListener{
            val move = Intent(this@breakfast, deskripsi_sup::class.java)
            startActivity(move)
        }
        buttontlurrebus.setOnClickListener{
            val move = Intent(this@breakfast, deskripsi_telurrebus::class.java)
            startActivity(move)
        }
        buttonomelet.setOnClickListener{
            val move = Intent(this@breakfast, deskripsi_omelet::class.java)
            startActivity(move)
        }
        buttonkaijo.setOnClickListener{
            val move = Intent(this@breakfast, deskripsi_kaijo::class.java)
            startActivity(move)
        }
    }
}