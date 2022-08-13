package com.example.maddkotlintute1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
    }

    fun openNewActivity(view: View){

        when(view.id){
            R.id.btnFPASend ->{

            }
            R.id.btnFPACancel ->{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

        }

    }
}