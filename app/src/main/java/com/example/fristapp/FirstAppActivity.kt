package com.example.fristapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatEditText


class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        /* Startup screen */

        val btnCompare = findViewById<Button>(R.id.btnCompare)
        val editText1 = findViewById<AppCompatEditText>(R.id.edit1)
        val editText2 = findViewById<AppCompatEditText>(R.id.edit2)
        val textView = findViewById<TextView>(R.id.textView)

        btnCompare.setOnClickListener {
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()

            if (text1.isNotEmpty() && text2.isNotEmpty()){
                if (text1 == text2){
                    textView.text = "Both messages are the same."
                } else {
                    textView.text = "The messages are different."
                }
            } else {
                textView.text = "One or both messages are missing."
            }


        }



    }
}