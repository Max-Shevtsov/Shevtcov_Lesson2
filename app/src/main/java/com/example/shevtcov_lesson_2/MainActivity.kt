package com.example.shevtcov_lesson_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {


    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        var text: String? = intent.getStringExtra("editedText")
        val lastEditedText = intent.getStringExtra("lastEditedText")
        if (text != null) {
            if (text.isNotEmpty()){
                textView.text = lastEditedText
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
