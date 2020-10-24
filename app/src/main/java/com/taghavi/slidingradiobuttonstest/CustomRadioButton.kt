package com.taghavi.slidingradiobuttonstest

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatRadioButton

class CustomRadioButton: AppCompatRadioButton {
    var order = -1
    lateinit var customRadioGroup: CustomRadioGroup
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        setMeasuredDimension(measuredWidth, measuredHeight)
    }
    override fun toggle() {
        if (customRadioGroup.selectedRadioButton.order < order) {
            setButtonDrawable(R.drawable.ic_radio_up)
            customRadioGroup.selectedRadioButton.setButtonDrawable(R.drawable.ic_radio_down)
        } else {
            setButtonDrawable(R.drawable.ic_radio_down)
            customRadioGroup.selectedRadioButton.setButtonDrawable(R.drawable.ic_radio_up)
        }
        super.toggle()
    }
}