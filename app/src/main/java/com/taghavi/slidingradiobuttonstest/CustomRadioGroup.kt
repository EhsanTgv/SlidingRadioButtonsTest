package com.taghavi.slidingradiobuttonstest

import android.content.Context
import android.util.AttributeSet
import android.widget.RadioGroup

class CustomRadioGroup : RadioGroup {
    lateinit var selectedRadioButton: CustomRadioButton
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        setMeasuredDimension(measuredWidth, measuredHeight)
    }
}