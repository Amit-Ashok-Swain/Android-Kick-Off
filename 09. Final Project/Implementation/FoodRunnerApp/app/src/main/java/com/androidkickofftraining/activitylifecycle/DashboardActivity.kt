package com.androidkickofftraining.activitylifecycle

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    /*Declaring the textview used for displaying the data*/
    lateinit var txtData: TextView

    /*Life-cycle method*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        /*Initialising the textview and linking it with the textview created in XML*/
        txtData = findViewById(R.id.txtData)

        /*Checking whether any data was received through the intent or not*/
        if (intent != null) {

            /*Fetching the details from the intent*/
            val details = intent.getBundleExtra("details")

            /*Getting the value of data from the bundle object*/
            val data = details?.getString("data")

            /*Checking the location from which data was sent*/
            if (data == "login") {
                /*Creating the text to be displayed*/
                val text = "Mobile Number : ${details?.getString("mobile")} \n " +
                        "Password : ${details?.getString("password")}"
                txtData.text = text
            }

            if (data == "register") {
                val text = " Name : ${details?.getString("name")} \n " +
                        "Mobile Number : ${details?.getString("mobile")} \n " +
                        "Password : ${details?.getString("password")} \n " +
                        "Address: ${details?.getString("address")}"
                txtData.text = text
            }

            if (data == "forgot") {
                val text = "Mobile Number : ${details.getString("mobile")} \n " +
                        "Email : ${details?.getString("email")}"
                txtData.text = text
            }

        } else {
            /*No data was received through the intent*/
            txtData.text = "No data received!!"
        }
    }
}
