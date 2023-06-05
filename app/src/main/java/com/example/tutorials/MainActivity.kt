package com.example.tutorials

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnApply=findViewById<Button>(R.id.btnApply)

        btnApply.setOnClickListener{
            val firstname= findViewById<EditText>(R.id.etFirstName).text.toString()
            val lastname= findViewById<EditText>(R.id.etLastName).text.toString()
            val birthdate= findViewById<EditText>(R.id.etBirthDate).text.toString()
            val country= findViewById<EditText>(R.id.etCountry).text.toString()
            Log.d("MainActivity", "$firstname $lastname born on $birthdate from $country just applied for the loan")

        }
    }
}