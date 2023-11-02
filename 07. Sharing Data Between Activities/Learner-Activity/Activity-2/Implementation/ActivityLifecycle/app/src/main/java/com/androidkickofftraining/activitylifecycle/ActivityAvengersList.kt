package com.androidkickofftraining.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

var titleName : String? = "Avengers"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avengers_list)
        /* supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.action_bar_layout)


        if(intent!=null){
            titleName = intent.getStringExtra("Greeting")
        }
        title = titleName

         */
    }
}