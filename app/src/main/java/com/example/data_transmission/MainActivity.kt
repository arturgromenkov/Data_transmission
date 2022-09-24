package com.example.data_transmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {//Что такое Activity?
    //Activity это одно окно
    override fun onCreate(savedInstanceState: Bundle?) {//Это так называемый цикл жизни Activity
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}