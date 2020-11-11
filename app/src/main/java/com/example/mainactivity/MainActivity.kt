package com.example.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //for seek bar age
        val seek = findViewById<SeekBar>(R.id.seekBarr)
        seek?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                val ageCount = findViewById<TextView>(R.id.ageCount)
                ageCount.text = progress.toString()
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
            }

            override fun onStopTrackingTouch(seek: SeekBar) {
            }
        })
        //Continue button listener that will execute continueToNextActivity function with 4 parameters
        findViewById<Button>(R.id.nextPagebtn).setOnClickListener{ continueToNextActivity(
            //Parameters
            findViewById<EditText>(R.id.firstName).text.toString(), //First name
            findViewById<EditText>(R.id.lastName).text.toString(), //Last name
            findViewById<EditText>(R.id.emailAdd).text.toString(), //Email
            findViewById<TextView>(R.id.ageCount).text.toString() //Age
        ) }
    }
    private fun continueToNextActivity(fname: String, lname: String, email: String, age: String) {
        val intent = Intent(this, NextPage::class.java)
        intent.putExtra("firstName", fname)
        intent.putExtra("lastName", lname)
        intent.putExtra("email", email)
        intent.putExtra("age", age)
        startActivity(intent)
    }
}