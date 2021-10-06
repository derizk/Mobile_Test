package com.example.myapplication

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var userET : EditText;
    private  lateinit var passET : EditText;
    private lateinit var login : Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login.setOnClickListener(){
            val user = userET.text.toString();
            val password = passET.text.toString();
            if (user.isEmpty()||password.isEmpty()){
                Toast.makeText(this, "Silahkan masukkan user dan password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(user == "admin01@gmail.com" || password == "admin01"){
                val progressDialog = ProgressDialog(this,
                    R.style.Theme_MaterialComponents_Light_Dialog)
                progressDialog.isIndeterminate = true
                progressDialog.setMessage("Loading...")
                progressDialog.show()
                val intent = Intent (this,Dashboard::class.java)
                startActivity(intent)
                finish()
            }

        }


}
}