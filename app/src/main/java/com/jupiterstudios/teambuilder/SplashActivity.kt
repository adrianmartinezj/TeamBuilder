package com.jupiterstudios.teambuilder

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val background = object : Thread() {
            override fun run(){
                try{
                    Thread.sleep(2500)
                    val intent = Intent(baseContext, AuthenticatorActivity::class.java)
                    startActivity(intent);
                } catch(e : Exception) {
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}
