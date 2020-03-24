package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        dynamic textView generated
         */
        createTextViewDynamically()

        /*
        Button click and dynamically text added to the TextView...
         */
        buttonClick.setOnClickListener { v ->
            text.text = "Text set on click of button"
            Toast.makeText(this, "Clicked ", Toast.LENGTH_LONG).show()
        }
    }

    private fun createTextViewDynamically() {
        val dynamicTextView = TextView(this)
        dynamicTextView.text = "This is dynamically created textView"
        dynamicTextView.textSize = 20f
        relLayout.addView(dynamicTextView)
    }
}
