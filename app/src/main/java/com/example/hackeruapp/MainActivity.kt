package com.example.hackeruapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun getName(): String{
        var name:String = "Hanan"
        name = "Hanan Avitan"
        return name
    }


    fun onButtonClick(view: View) {
        val textView: TextView = findViewById<TextView>(R.id.hello_text)
        textView.text = "Hello ${ getName ()} How are you?"
    }
}
