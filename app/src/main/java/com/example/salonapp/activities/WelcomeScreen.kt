package com.example.salonapp.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.salonapp.R

class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        setContentView(R.layout.activity_welcome_screen);
    }

    fun register(view: View) {
        val intent = Intent(this, Registration::class.java)
        startActivity(intent)
    }
    fun login(view: View) {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }
}