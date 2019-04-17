package com.jupiterstudios.teambuilder

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var submitButton = findViewById<Button>(R.id.register_submit_button);
        submitButton.setOnClickListener{
            val intent = Intent(baseContext, AuthenticatorActivity::class.java)
            startActivity(intent)
        }
    }
}
