package com.androidkickofftraining.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AvengersActivity : AppCompatActivity() {

    private lateinit var etTextMessage : EditText
    private lateinit var btnSend : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avengers)
        title = "Send Message"
       etTextMessage = findViewById(R.id.etTextMessage)
        btnSend = findViewById(R.id.btnSend)

         btnSend.setOnClickListener {
             val text = etTextMessage.text.toString().trim()

             if(text.isNotEmpty()){
                 Toast.makeText(
                     this@AvengersActivity,
                     "Message sent successfully !",
                     Toast.LENGTH_SHORT
                 ).show()
                 var intent = Intent(this@AvengersActivity, MessageActivity :: class.java)
                 intent.putExtra("message",text)
                 startActivity(intent)
             }else{
                 Toast.makeText(
                     this@AvengersActivity,
                     "Enter the message before sending",
                     Toast.LENGTH_LONG
                 ).show()
             }
         }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}