package com.example.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class singup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singup)


        var name:EditText=findViewById(R.id.et_name)
         var pass:EditText=findViewById(R.id.et_password)
         var result:Button=findViewById(R.id.btn_signup)


        result.setOnClickListener(){

            var name1 : String="html"
            var pass1 : String="abc"

            if (name.equals(name1) || pass.equals(pass1)) {

                var demo: Intent = Intent(this, MainActivity::class.java)
                startActivity(demo)
                Toast.makeText(this, "SignUp sucessfully", Toast.LENGTH_SHORT)
            }
            else
            {
                Toast.makeText(this, "SignUp Failed", Toast.LENGTH_SHORT)
            }


        }


    }
}