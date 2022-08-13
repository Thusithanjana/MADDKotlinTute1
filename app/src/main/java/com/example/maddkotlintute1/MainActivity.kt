package com.example.maddkotlintute1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openNewActivity(view:View){

        when(view.id){
            R.id.btnMALogin ->{

            }
            R.id.btnMARegister ->{
                val intent = Intent(this, RegisterActivity::class.java)
                startActivity(intent)
            }
            R.id.btnMAForgotPassword ->{
                val intent = Intent(this, ForgotPasswordActivity::class.java)
                startActivity(intent)
            }

        }

    }


}