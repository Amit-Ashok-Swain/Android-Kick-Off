package com.androidkickofftraining.activitylifecycle


import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    lateinit var etFirstName: EditText
    lateinit var etLastName: EditText
    lateinit var etMobileNumber: EditText
    lateinit var etChooseAPassword: EditText
    lateinit var etConfirmYourPassword: EditText
    lateinit var btnRegister: Button

    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize sharedPreferences before using it
        sharedPreferences =
            getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)

        val isRegistered = sharedPreferences.getBoolean("isRegistered", false)

        setContentView(R.layout.activity_register)

        if (isRegistered) {
            Toast.makeText(
                this@RegisterActivity,
                "The User is Already Registered !",
                Toast.LENGTH_LONG
            ).show()
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
            Toast.makeText(
                this@RegisterActivity,
                "Kindly Login with your Registered Mobile Number !",
                Toast.LENGTH_SHORT
            ).show()
        }

        title = "Register Yourself !"

        etFirstName = findViewById(R.id.etFirstName)
        etLastName = findViewById(R.id.etLastName)
        etMobileNumber = findViewById(R.id.etMobileNumber)
        etChooseAPassword = findViewById(R.id.etChooseAPassword)
        etConfirmYourPassword = findViewById(R.id.etConfirmYourPassword)
        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val FirstName = etFirstName.text.toString()
            val LastName = etLastName.text.toString()
            val MobileNumber = etMobileNumber.text.toString()
            val ChooseAPassword = etChooseAPassword.text.toString()
            val ConfirmYourPassword = etConfirmYourPassword.text.toString()

            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)

            if (FirstName.isNotEmpty() && LastName.isNotEmpty() && MobileNumber.isNotEmpty() && ChooseAPassword.isNotEmpty() && ConfirmYourPassword.isNotEmpty()) {
                when (ChooseAPassword == ConfirmYourPassword) {
                    true -> {
                        when (MobileNumber.length == 10) {
                            true -> {
                                savePreferences()
                                Toast.makeText(
                                    this@RegisterActivity,
                                    "Registration Successful !",
                                    Toast.LENGTH_LONG
                                ).show()
                                startActivity(intent)
                            }

                            else -> {
                                Toast.makeText(
                                    this@RegisterActivity,
                                    "Enter a Valid Mobile Number",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }

                        }

                    }

                    else -> {
                        Toast.makeText(
                            this@RegisterActivity,
                            "Your Chosen Password doesn't match with your Confirm Password ",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            } else {
                Toast.makeText(
                    this@RegisterActivity,
                    "All the input fields are required",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    fun savePreferences() {
        sharedPreferences.edit().putBoolean("isRegistered", true).apply()
    }

    override fun onPause() {
        super.onPause()
        intent = Intent(this@RegisterActivity,LoginActivity::class.java)
        startActivity(intent)
    }

}
