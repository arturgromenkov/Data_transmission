package com.example.data_transmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {//Что такое Activity?
    //Activity это одно окно
    override fun onCreate(savedInstanceState: Bundle?) {//Это так называемый цикл жизни Activity
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val settingsbutton: ImageButton=findViewById(R.id.to_settings_button)

        settingsbutton.setOnClickListener()

        {
            val Intent= Intent(this,SettingsActivity::class.java)
            startActivity(Intent)
        }
    }
}