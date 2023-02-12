package com.example.shevtcov_lesson_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.properties.Delegates


class MainActivity : AppCompatActivity() {


    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        var stringFromEditText: String? = intent.getStringExtra("editedText")

        if (stringFromEditText != null) {
            if (stringFromEditText.isNotEmpty()){
                textView.text = stringFromEditText
            }
        }
    }

    override fun onStart() {
        super.onStart()
    }
    fun onSecondActivity(view: View) {
        val switchIntent = Intent(this, SecondActivity::class.java)
        startActivity(switchIntent)
    }



}
