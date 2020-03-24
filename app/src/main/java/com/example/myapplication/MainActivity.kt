package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout.JUSTIFICATION_MODE_INTER_WORD
import android.view.Gravity
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createTextViewDynamically()
        createButtonDynamically()

        /*
        Button click and dynamically text added to the TextView...
         */
        buttonClick.setOnClickListener { v ->
            text.text = "Text set on click of button"
            Toast.makeText(this, "Clicked ", Toast.LENGTH_LONG).show()
        }
    }

    /*
        Create a new TextView programmatically in Kotlin Android

     */
    private fun createTextViewDynamically() {
        val dynamicTextView = TextView(this)
        dynamicTextView.text =
            "This is dynamically created textView this is my first kotlin example as i am learning any king of mistake ,can be taken as a part of learning making my self more error free.."
        dynamicTextView.textSize = 20f
        dynamicTextView.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        mainLayout.addView(dynamicTextView)
    }

    /*
    Create a new Button programmatically in Kotlin Android
     */
    private fun createButtonDynamically() {
        val dynamicButton = Button(this)
        dynamicButton.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        dynamicButton.text = "Dynamic Button"
        dynamicButton.setBackgroundColor(Color.GREEN)
        mainLayout.addView(dynamicButton)

        dynamicButton.setOnClickListener { v->
            text.text="Dynamic button clicked by user"
        }
    }
}
