package com.example.salonapp.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.salonapp.BottomNavigation
import com.example.salonapp.R

class Login : AppCompatActivity() {

    private lateinit var LoginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        LoginBtn = findViewById(R.id.btnSignUp)


        LoginBtn.setOnClickListener(){
            val intent = Intent(this, BottomNavigation::class.java)
            startActivity(intent)
        }


    }



    fun register(view: View) {
        val intent = Intent(this, Registration::class.java)
        startActivity(intent)
    }

    fun MainActivity(view: View) {
        val intent = Intent(this, BottomNavigation::class.java)
        startActivity(intent)
    }


}