package com.androidkickofftraining.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    private lateinit var txtregisterYourself: TextView
    private lateinit var btnlogin: Button
    private lateinit var etMobileNumber: EditText
    private lateinit var etPassword: EditText
    private lateinit var txtForgotPassword: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtregisterYourself = findViewById(R.id.txtRegisterYourself)
        btnlogin = findViewById(R.id.btnLogin)

        txtForgotPassword.setOnClickListener {
            // Navigate to the ForgotPasswordActivity
            startActivity(Intent(this@LoginActivity, ForgotPasswordActivity::class.java))
        }

        txtregisterYourself.setOnClickListener {
            // Navigate to the RegisterActivity
            val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }

        btnlogin.setOnClickListener {
            // Handle login button click
            val mobileNumber = etMobileNumber.text.toString()
            val password = etPassword.text.toString()

            if (isValidCredentials(mobileNumber, password)) {
                // Credentials are valid, navigate to the DashboardActivity
                val intent = Intent(this@LoginActivity, DashboardActivity::class.java)
                startActivity(intent)
            } else {
                // Handle invalid credentials (show an error message or toast)
            }
        }
    }

    // Function to check the validity of credentials
    private fun isValidCredentials(mobileNumber: String, password: String): Boolean {
        // Implement your logic to check credentials here
        // For example, you can compare the entered values with your valid credentials
        // Return true if credentials are valid, false otherwise
        return false
    }
}
/*
class LoginActivity : AppCompatActivity() {

    /*Declaring the different variables used for this activity*/
    private lateinit var registerYourself: TextView
    private lateinit var login: Button
    private lateinit var etMobileNumber: EditText
    private lateinit var etPassword: EditText
    private lateinit var txtForgotPassword: TextView

    /*Life-cycle method of the activity*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*Linking the view*/
        setContentView(R.layout.activity_login)


        /*Initialising the views with the ones defined in the XML*/
        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        registerYourself = findViewById(R.id.txtRegisterYourself)
        login = findViewById(R.id.btnLogin)

        /*Handling the clicks using the setOnClickListener method*/
        txtForgotPassword.setOnClickListener {
            startActivity(Intent(this@LoginActivity, ForgotPasswordActivity::class.java))
        }
        registerYourself.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
        }


        login.setOnClickListener {

            /*Declaring the intent which sets up the route for the navigation of the activity*/
            val intent = Intent(this@LoginActivity, DashboardActivity::class.java)

            /*Declaring the bundle object which will carry the data
            * You can send the data inside intents
            *
            * We specifically used Bundle just to demonstrate a new technique*/
            val bundle = Bundle()

            /*Setting a value data which is activity specific. This will be used to identify from where the data was sent*/
            bundle.putString("data", "login")

            /*Putting the values in Bundle*/
            bundle.putString("mobile", etMobileNumber.text.toString())
            bundle.putString("password", etPassword.text.toString())

            /*Putting the Bundle to be shipped with the intent*/
            intent.putExtra("details", bundle)

            /*Starting the new activity by sending the intent in the startActivity method*/
            startActivity(intent)
        }

    }
}
*/