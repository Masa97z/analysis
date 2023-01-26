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
        forgetPass()
        toLogIn()
    }

    private fun toLogIn() {
        var forget = findViewById<TextView>(R.id.tologin)
        forget.setOnClickListener {
            val intent = Intent(this , Main_without_itemActivity::class.java)
            startActivity(intent)
        }    }

    private fun forgetPass() {
        var forget = findViewById<TextView>(R.id.forget_your)
        forget.setOnClickListener {
            val intent = Intent(this , ForgetpasswordActivity::class.java)
            startActivity(intent)
        }
    }


    private fun register() {
        var buttonRegister = findViewById<TextView>(R.id.create_account)
        buttonRegister.setOnClickListener {
            val intent = Intent(this , RegisterActivity::class.java)
            startActivity(intent)
        }
    }

}