package com.example.mad_practical_6_21012021012

import android.R.attr.button
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start : Button = findViewById(R.id.button)
        start.setOnClickListener {
            playpause()
        }

        val stop : Button = findViewById(R.id.button2)
        stop.setOnClickListener {
            stop()
        }
    }

    fun playpause(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply { startService(this) }
    }

    fun stop(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply { stopService(this) }
    }


}