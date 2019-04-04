package com.jupiterstudios.teambuilder

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val background = object : Thread() {
            override fun run(){
                try{
                    Thread.sleep(2500)
                    val intent = Intent(baseContext, MainActivity::class.java)
                } catch(e : Exception) {
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}
