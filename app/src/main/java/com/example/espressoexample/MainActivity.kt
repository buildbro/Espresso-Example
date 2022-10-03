package com.example.espressoexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        messageTv = findViewById(R.id.message_textview)

        val usaBtn: Button = findViewById(R.id.button_usa)
        val ukBtn: Button = findViewById(R.id.button_uk)
        val ngBtn: Button = findViewById(R.id.button_ng)

        usaBtn.setOnClickListener {
            updateMessage("USD")
        }

        ukBtn.setOnClickListener {
            updateMessage("GBP")
        }

        ngBtn.setOnClickListener {
            updateMessage("NGN")
        }
    }

    lateinit var messageTv: TextView
    private fun updateMessage(message: String) {
        messageTv.text = message
    }
}
