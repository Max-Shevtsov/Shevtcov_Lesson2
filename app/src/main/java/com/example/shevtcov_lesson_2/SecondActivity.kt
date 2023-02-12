package com.example.shevtcov_lesson_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

    }

    fun onFirstActivity(view: View) {
        val switchIntent = Intent(this, MainActivity::class.java)
        val editText = findViewById<EditText>(R.id.et_write_something)
        val text = editText.text.toString()
        if (text != null) {
            if (text.isNotEmpty())
                switchIntent.putExtra("editedText", text)
        }
        startActivity(switchIntent)

    }
}


