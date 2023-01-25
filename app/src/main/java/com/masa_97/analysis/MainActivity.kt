package com.masa_97.analysis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        register()
    }

    private fun register() {
        var bu = findViewById<TextView>(R.id.create_account)
        bu.setOnClickListener {
            val intent = Intent(this , RegisterActivity::class.java)
            startActivity(intent)
        }
    }

}