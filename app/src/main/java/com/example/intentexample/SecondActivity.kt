package com.example.intentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {

    private lateinit var textFirstName : TextView
    private lateinit var textLastName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textFirstName = findViewById(R.id.tvFirstName)
        textLastName = findViewById(R.id.tvLastname)

        val FirstName = intent.getStringExtra("Firstname")
        val LastName = intent.getStringExtra("Lastname")

        textFirstName.text = "Firstname: " + FirstName
        textLastName.text = "Lastname: " + LastName
    }
}