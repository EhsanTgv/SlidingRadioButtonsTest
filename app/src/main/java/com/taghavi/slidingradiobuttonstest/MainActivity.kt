package com.taghavi.slidingradiobuttonstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listOfOptions:List<String>  = listOf("one", "two", "one")

        customRadioGroup.setOnCheckedChangeListener(null)
        customRadioGroup.removeAllViews()
        customRadioGroup.selectedRadioButton = CustomRadioButton(this)
        for (i  in listOfOptions.indices) {
            val customRadioButton = CustomRadioButton(this)
            customRadioButton.id = View.generateViewId()
            customRadioButton.order = i
            customRadioButton.customRadioGroup = customRadioGroup
            customRadioButton.text = listOfOptions[i]
            customRadioGroup.addView(customRadioButton)
        }
        customRadioGroup.setOnCheckedChangeListener { radioGroup, clickedButton ->
            val customRadioButton: CustomRadioButton = radioGroup.findViewById(clickedButton)
            if (customRadioButton.isChecked) {
                customRadioGroup.selectedRadioButton = customRadioButton
            }
        }
    }
}