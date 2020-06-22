package com.example.popularpersons.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.popularpersons.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

const val THREE_SECONDS = 3000L
class SplashActivity : AppCompatActivity() {
    private val foreground = CoroutineScope(Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        foreground.launch {
            delay(THREE_SECONDS)
            startActivity(Intent(this@SplashActivity,MainActivity::class.java))
            finish()
        }
    }
}