package com.androidkickofftraining.activitylifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar

var titleName : String? = "Avengers"
lateinit var sharedPreferences: SharedPreferences
lateinit var btnLogout : Button
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name),Context.MODE_PRIVATE)
        setContentView(R.layout.avengers_list)
        /* supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.action_bar_layout)
         */

       titleName = sharedPreferences.getString("Title", "The Avengers")

        title = titleName

        btnLogout = findViewById(R.id.btnLogout)

        btnLogout.setOnClickListener {

            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
            sharedPreferences.edit().clear().apply()
            Toast.makeText(this@MainActivity,
                "Logout Successful !",
                Toast.LENGTH_SHORT).show()

        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}