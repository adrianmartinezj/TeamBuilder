package com.jupiterstudios.teambuilder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class AuthenticatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authenticatior)
    }
}

//JAVA VERSION OF AUTHENTICATOR -- FOR REFERENCE
//package com.amazonaws.mobile.samples.mynotes.ui
//
//import android.app.Activity
//import android.content.Intent
//import android.support.v7.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Toast
//
//import com.amazonaws.mobile.auth.core.DefaultSignInResultHandler
//import com.amazonaws.mobile.auth.core.IdentityManager
//import com.amazonaws.mobile.auth.core.IdentityProvider
//import com.amazonaws.mobile.auth.ui.AuthUIConfiguration
//import com.amazonaws.mobile.auth.ui.SignInActivity
//import com.amazonaws.mobile.samples.mynotes.Injection
//import com.amazonaws.mobile.samples.mynotes.R
//
//class AuthenticatorActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_authenticator)
//
//        val identityManager = Injection.getAWSService().getIdentityManager()
//        // Set up the callbacks to handle the authentication response
//        identityManager.login(this, object : DefaultSignInResultHandler() {
//            override fun onSuccess(activity: Activity, identityProvider: IdentityProvider) {
//                Toast.makeText(
//                    this@AuthenticatorActivity,
//                    String.format("Logged in as %s", identityManager.getCachedUserID()),
//                    Toast.LENGTH_LONG
//                ).show()
//                // Go to the main activity
//                val intent = Intent(activity, NoteListActivity::class.java)
//                    .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
//                activity.startActivity(intent)
//                activity.finish()
//            }
//
//            override fun onCancel(activity: Activity): Boolean {
//                return false
//            }
//        })
//
//        // Start the authentication UI
//        val config = AuthUIConfiguration.Builder()
//            .userPools(true)
//            .build()
//        SignInActivity.startSignInActivity(this, config)
//        this@AuthenticatorActivity.finish()
//    }
//}