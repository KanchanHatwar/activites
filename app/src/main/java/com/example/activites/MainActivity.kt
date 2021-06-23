package com.example.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var a: EditText = findViewById(R.id.et_name)
        var b: EditText = findViewById(R.id.et_password)
        var butoon: Button = findViewById(R.id.btn_login)

        butoon.setOnClickListener() {
            var name: String = "java"
            var pass: String = "abc"
            if (a.equals(name) || b.equals(pass)) {
                var c : Intent= Intent(this,singup ::class.java)
                        startActivity(c)


                Toast.makeText(this, "login succesfully", Toast.LENGTH_SHORT)

            }
            else {
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT)
            }
        }
    }



        }
