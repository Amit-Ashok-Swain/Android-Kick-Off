package com.androidkickofftraining.facebook_login_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.facebook_login)
    }

    override fun onStart() {
        super.onStart()
        println("Application has started!")
    }

    override fun onResume() {
        super.onResume()
        println("Application is running!")
    }

    override fun onPause() {
        super.onPause()
        println("Application has paused and is in background!")
    }

    override fun onStop() {
        super.onStop()
        println("Application has stopped and is still in background!")
    }

    override fun onRestart() {
        super.onRestart()
        println("Application has re-started again and it is running!")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("Application is closed and it is not running in background as well!")
    }
}