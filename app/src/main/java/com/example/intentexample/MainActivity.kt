package com.example.intentexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var btnSend : Button
    private lateinit var txtLname: EditText
    private lateinit var txtFname: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend = findViewById(R.id.btnSendData)
        txtFname = findViewById(R.id.etFname)
        txtLname = findViewById(R.id.etLname)

        btnSend.setOnClickListener {
            startActivity(Intent(this@MainActivity,SecondActivity::class.java)
                .putExtra("Firstname", txtFname.text.toString())
                .putExtra("Lastname", txtLname.text.toString()))
        }

    }
}