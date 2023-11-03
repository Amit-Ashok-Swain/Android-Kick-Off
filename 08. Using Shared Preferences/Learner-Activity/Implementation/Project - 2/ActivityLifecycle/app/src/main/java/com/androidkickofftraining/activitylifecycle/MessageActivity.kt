package com.androidkickofftraining.activitylifecycle

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MessageActivity : AppCompatActivity() {

    lateinit var txtMessage: TextView
    var message = "Custom Message"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        txtMessage = findViewById(R.id.txtMessage)

        if (intent != null) {
            message = intent.getStringExtra("Message").toString()
            txtMessage.text = message
        }

    }
}
