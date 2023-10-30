package com.androidkickofftraining.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        title = "Log In"
    }
}