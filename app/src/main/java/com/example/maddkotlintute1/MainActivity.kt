package com.example.maddkotlintute1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.maddkotlintute1.data.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val person = intent.getSerializableExtra("person") as? User

        if (person != null) {
            Toast.makeText(this,"${person.name} | ${person.email} | " +
                    "${person.password}",Toast.LENGTH_LONG).show()
        };

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