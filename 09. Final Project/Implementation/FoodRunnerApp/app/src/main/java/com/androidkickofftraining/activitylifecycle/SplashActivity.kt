package com.androidkickofftraining.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    /*Life-cycle method of the activity*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*Setting up the view for the activity*/
        setContentView(R.layout.activity_splash)

        /*This is how we change the activity with a delay of 2000 milliseconds.
        * The delay time can be changed by changing the value of the time in milliseconds
        * Here the activity is displayed for 2 seconds and then the Handler starts the new process after 2 seconds
        * the new task is the one which we write inside the handler.
        * startActivity() is used to start the new activity, whereas finish() is used to destroy the current activity.
        * We use finish() here so the when the user presses back button, she is not redirected to this activity*/
        Handler().postDelayed({
            startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
            finish()
        }, 2000)
    }
}
