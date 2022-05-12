package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBmi: Button
    lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmi = findViewById(R.id.btnBmi)
        btnBmi.setOnClickListener {
            val intent = Intent(this, CalculateBmiActivity::class.java)
            startActivity(intent)
        }
        setContentView(R.layout.activity_main)
        btnSend = findViewById(R.id.btnSend)
        btnSend.setOnClickListener {
            val intent = Intent(this, SendMoneyActivity::class.java)
            startActivity(intent)
        }
    }
}

