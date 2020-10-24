package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count=0
        
        counterView.text = count.toString()

        addButton.setOnClickListener{
            counterView.text = (++count).toString()
        }

        subButton.setOnClickListener{
            counterView.text = (--count).toString()
        }

    }

}