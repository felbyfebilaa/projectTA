package com.example.dailyhealtheats

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.dailyhealtheats.MainActivity

class splashscreen : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 2000 // Durasi tampilan SplashScreen
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        // Menggunakan Handler untuk menjalankan tugas setelah SPLASH_TIME_OUT
        Handler().postDelayed({
            // Intent untuk berpindah ke MainActivity setelah SplashScreen selesai
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Menutup SplashScreenActivity agar tidak dapat kembali lagi
        }, SPLASH_TIME_OUT)
    }
}