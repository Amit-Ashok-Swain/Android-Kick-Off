package com.androidkickofftraining.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MessageActivity : AppCompatActivity() {

    private lateinit var txtDisplayMessage : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        txtDisplayMessage = findViewById(R.id.txtDisplayMessage)

        if(intent!=null){
            title = "Your Message"
            val message = intent.getStringExtra("message")
            // Display the message in the TextView
            txtDisplayMessage.text = message
        }
    }
}