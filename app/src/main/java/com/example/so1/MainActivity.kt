package com.example.so1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tomer.fadingtextview.FadingTextView
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texts = arrayOf("Welcome!", "Hello", "Geek")

        val ftv = findViewById<FadingTextView>(R.id.fadingTextView)
        ftv.setTexts(texts)

        ftv.setTimeout(500,TimeUnit.MILLISECONDS)
    }
}