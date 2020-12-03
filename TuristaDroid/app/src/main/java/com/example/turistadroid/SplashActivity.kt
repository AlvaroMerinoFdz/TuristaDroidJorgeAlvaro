package com.example.turistadroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatDelegate

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        val animacion1= AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba)
        val img: ImageView =findViewById(R.id.imgLogoSplash)

        img.animation=animacion1

        Handler(Looper.getMainLooper()).postDelayed({
            run {
                val intent= Intent(this,LoginActivity::class.java)
                startActivity(intent)
                finish()
            }
        }, 3000)
    }
}