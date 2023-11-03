package com.androidkickofftraining.activitylifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class ForgotPasswordActivity : AppCompatActivity() {

   lateinit var etRegisteredMobileNumber : EditText
   lateinit var btnSendLinkOnMobile : Button

   lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        title = "Forget Password"

        etRegisteredMobileNumber = findViewById(R.id.etRegisteredMobileNumber)
        btnSendLinkOnMobile = findViewById(R.id.btnSendLinkOnMobile)

        val intent = Intent(this@ForgotPasswordActivity,LoginActivity::class.java)

        btnSendLinkOnMobile.setOnClickListener {
            val RegisteredMobileNumber = etRegisteredMobileNumber.text.toString()

            if(RegisteredMobileNumber.isNotEmpty()){

                when(RegisteredMobileNumber.length==10){
                    true->{
                        Toast.makeText(this@ForgotPasswordActivity,
                            "Password reset link sent to your Registered Mobile Number !",
                            Toast.LENGTH_LONG).show()
                        startActivity(intent)
                    }
                    else->{
                        Toast.makeText(this@ForgotPasswordActivity,
                            "Please Enter a Valid Mobile Number",
                            Toast.LENGTH_SHORT).show()
                    }
                }
            }else{
                Toast.makeText(this@ForgotPasswordActivity,
                    "Kindly Enter a Mobile Number to Receive Reset Link",
                    Toast.LENGTH_SHORT).show()
                }
            }
        }

    override fun onPause() {
        super.onPause()
        finish()
    }

    }


