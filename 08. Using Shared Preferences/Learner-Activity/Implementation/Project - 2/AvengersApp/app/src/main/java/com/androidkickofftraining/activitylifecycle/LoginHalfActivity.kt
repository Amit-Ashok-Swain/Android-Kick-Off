package com.androidkickofftraining.activitylifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginHalfActivity : AppCompatActivity() {

    lateinit var etMobileNumberIS: EditText
    lateinit var etPasswordIS: EditText
    lateinit var btnLoginIS: Button
    lateinit var txtForgotPasswordIS: TextView
    lateinit var txtRegisterYourselfIS: TextView
    val validMobileNumberIS = "9876543210"
    val validPasswordIS = arrayOf("tony", "steve", "bruce", "thanos")

    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)

        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false)

        setContentView(R.layout.activity_login)

        if (isLoggedIn) {
            val intent = Intent(this@LoginHalfActivity, AvengersActivity::class.java)
            startActivity(intent)
            finish()
        }

        title = "Log In"

        etMobileNumberIS = findViewById(R.id.etMobileNumberIS)
        etPasswordIS = findViewById(R.id.etPasswordIS)
        btnLoginIS = findViewById(R.id.btnLoginIS)
        txtForgotPasswordIS = findViewById(R.id.txtForgotPasswordIS)
        txtRegisterYourselfIS = findViewById(R.id.txtRegisterIS)

        btnLoginIS.setOnClickListener {

            val mobileNumber = etMobileNumberIS.text.toString()

            val password = etPasswordIS.text.toString()

            var nameOfAvenger = "Avenger"

            val intent = Intent(this@LoginHalfActivity, AvengersActivity::class.java)

            if ((mobileNumber == validMobileNumberIS)) {

                when (password) {
                    validPasswordIS[0] -> {

                        nameOfAvenger = "Iron Man"

                        savePreferences(nameOfAvenger)

                        startActivity(intent)

                    }
                    validPasswordIS[1] -> {

                        nameOfAvenger = "Captain America"

                        savePreferences(nameOfAvenger)

                        startActivity(intent)

                    }
                    validPasswordIS[2] -> {

                        nameOfAvenger = "The Hulk"

                        savePreferences(nameOfAvenger)

                        startActivity(intent)

                    }
                    validPasswordIS[3] -> {

                        nameOfAvenger = "The Avengers"

                        savePreferences(nameOfAvenger)

                        startActivity(intent)

                    }
                    else -> Toast.makeText(this@LoginHalfActivity, "Incorrect Password", Toast.LENGTH_LONG).show()
                }

            } else {

                Toast.makeText(this@LoginHalfActivity, "Incorrect Credentials", Toast.LENGTH_LONG).show()

            }
        }


        txtForgotPasswordIS.setOnClickListener {
            val intent = Intent(this@LoginHalfActivity, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        txtRegisterYourselfIS.setOnClickListener {
            val intent = Intent(this@LoginHalfActivity, RegisterActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onPause() {
        super.onPause()
        finish()
    }

    fun savePreferences(title: String) {
        sharedPreferences.edit().putBoolean("isLoggedIn", true).apply()
        sharedPreferences.edit().putString("title", title).apply()
    }
}
