package com.example.maddkotlintute1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.maddkotlintute1.data.User

class RegisterActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
    fun openNewActivity(view: View){

        when(view.id){
            R.id.btnRASend ->{
                saveData()

            }
            R.id.btnRACancel ->{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

        }

    }

    fun saveData(){
        val edtRAName = findViewById<EditText>(R.id.edtRAName);
        val edtRAPassword = findViewById<EditText>(R.id.edtRAPassword);
        val edtRAReEnterPassword = findViewById<EditText>(R.id.edtRAReEnterPassword);
        val edtRAEmail = findViewById<EditText>(R.id.edtRAEmail);

        if(edtRAPassword.text.toString().isEmpty()||edtRAReEnterPassword.text.toString().isEmpty()
            || edtRAName.text.toString().isEmpty()||edtRAEmail.text.toString().isEmpty()){
            Toast.makeText(this,"Please fill the form",Toast.LENGTH_LONG).show()

        }else{
            if(edtRAPassword.text.toString().equals(edtRAReEnterPassword.text.toString())){
                var user = User(edtRAName.text.toString(),edtRAPassword.text.toString(),
                    edtRAEmail.text.toString())
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("person",user)
                }
                startActivity(intent)

            }else{
                Toast.makeText(this,"Passwords mismatch",Toast.LENGTH_LONG).show()
            }
        }




    }
}