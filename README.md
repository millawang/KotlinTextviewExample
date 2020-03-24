# KotlinTextviewExample
- Basic thing of Kotlin..
- Button click and dynamically text added to the TextView...
- Create a new TextView programmatically in Kotlin Android
private fun createTextViewDynamically() {
        val dynamicTextView = TextView(this)
        dynamicTextView.text =
            "This is dynamically created textView this is my first kotlin example as i am learning any king of mistake ,can be taken as a part of learning making my self more error free.."
        dynamicTextView.textSize = 20f
        dynamicTextView.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        mainLayout.addView(dynamicTextView)
    }
- Create a new Button programmatically in Kotlin Android
- setting layout_width and layout_height using layout parameters
- Disable All Caps in Android Button
- Set OnClickListener for Button
- Android TextView – Justify Text
