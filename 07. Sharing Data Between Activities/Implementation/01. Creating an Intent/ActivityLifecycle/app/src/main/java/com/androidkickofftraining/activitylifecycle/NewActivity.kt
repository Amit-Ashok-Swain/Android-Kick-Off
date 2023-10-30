package com.androidkickofftraining.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class NewActivity : AppCompatActivity() {


    lateinit var etMobileNumber: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogIn: Button
    lateinit var txtForgetPassword: TextView
    lateinit var txtRegisterYourself:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        title = "Log In"
        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogIn = findViewById(R.id.btnLogIn)
        txtForgetPassword = findViewById(R.id.txtForgetPassword)
        txtRegisterYourself = findViewById(R.id.txtRegisterYourself)

        btnLogIn.setOnClickListener {
         Toast.makeText(this@NewActivity,
             "We clicked on this button to see the Toast",
             Toast.LENGTH_LONG
             ).show()

            val intent = Intent(this@NewActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }

}