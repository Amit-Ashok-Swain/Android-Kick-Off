package com.androidkickofftraining.activitylifecycle

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var etMobileNumber : EditText
    lateinit var etPassword : EditText
    lateinit var btnLogIn : Button
    lateinit var txtForgetPassword : TextView
    lateinit var txtRegisterYourself : TextView

   val validMobileNumber = "0123456789"
   val validPassword = arrayOf("tony","steve","thor","bruce","t'challa", "natasha")

   lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)

        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn",false)

         setContentView(R.layout.activity_login)

        if(isLoggedIn){
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
             startActivity(intent)
            finish()
        }
    /*    else
        {
            setContentView(R.layout.activity_login)
        }

     */

        title = "Welcome to Avenger's Login Portal !"

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogIn = findViewById(R.id.btnLogIn)
        txtForgetPassword = findViewById(R.id.txtForgetPassword)
        txtRegisterYourself = findViewById(R.id.txtRegisterYourself)

        btnLogIn.setOnClickListener {

            val mobileNumber = etMobileNumber.text.toString()
            val password = etPassword.text.toString()

            var greeting: String = "Avengers"

            val intent = Intent(this@LoginActivity,MainActivity::class.java)


            if (mobileNumber == validMobileNumber) {

                if (password == validPassword[0]) {

                    greeting = "Hello! Iron Man"

                    savePreferences(greeting)

                    Toast.makeText(
                        this@LoginActivity,
                        "Welcome to the portal, Tony Stark",
                        Toast.LENGTH_LONG
                    ).show()

                    startActivity(intent)

                } else if (password == validPassword[1]){

                  greeting = "Hello! Captain America"

                    savePreferences(greeting)

                    Toast.makeText(
                        this@LoginActivity,
                        "Welcome to the portal, Steve Rogers",
                        Toast.LENGTH_LONG).show()

                    startActivity(intent)

                } else if(password == validPassword[2]){

                    greeting = "Hello! Thor"

                    savePreferences(greeting)

                    Toast.makeText(this@LoginActivity,
                        "Welcome to the portal, Thor Odin-son",
                        Toast.LENGTH_LONG).show()

                    startActivity(intent)

                } else if(password == validPassword[3]){

                    greeting = "Hello! Hulk"

                    savePreferences(greeting)

                    Toast.makeText(this@LoginActivity,
                        "Welcome to the portal, Dr Bruce Banner",
                        Toast.LENGTH_LONG).show()

                    startActivity(intent)

                }else if(password == validPassword[4]){

                    greeting = "Hello! Black Panther"

                    savePreferences(greeting)

                    Toast.makeText(this@LoginActivity,
                        "Welcome to the portal, T' Challa",
                        Toast.LENGTH_LONG).show()

                    startActivity(intent)

                }else if(password == validPassword[5]){

                    greeting = "Hello! Black Widow"

                    savePreferences(greeting)

                    Toast.makeText(this@LoginActivity,
                        "Welcome to the portal, Natasha Romanova",
                        Toast.LENGTH_LONG).show()

                    startActivity(intent)

                }else{
                    Toast.makeText(this@LoginActivity,
                        "Incorrect Email or Password",
                        Toast.LENGTH_LONG).show()
                }

            }else{
                Toast.makeText(this@LoginActivity,
                    "Invalid Credentials",
                    Toast.LENGTH_LONG).show()
            }

        }

    }

    override fun onPause() {
        super.onPause()
        finish()
    }

     fun savePreferences(title : String){
         sharedPreferences.edit().putString("Title",title).apply()
         sharedPreferences.edit().putBoolean("isLoggedIn", true).apply()
    }

}