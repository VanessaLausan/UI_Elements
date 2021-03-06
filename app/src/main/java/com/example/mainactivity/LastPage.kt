package com.example.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LastPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_page)

        findViewById<TextView>(R.id.finalFirstName).setText("First Name: ${(intent.getStringExtra("firstName"))}")
        findViewById<TextView>(R.id.finalLastName).setText("Last Name: ${( intent.getStringExtra("lastName"))}")
        findViewById<TextView>(R.id.finalEmail).setText("Email: ${( intent.getStringExtra("email"))}")
        findViewById<TextView>(R.id.finalAge).setText("Age: ${( intent.getStringExtra("age"))}")
        findViewById<TextView>(R.id.finalPhone).setText("Number: ${ (intent.getStringExtra("phoneNumber"))}")
        findViewById<TextView>(R.id.finalBirthday).setText("Birthday: ${( intent.getStringExtra("birthDate") )}")

    }
}