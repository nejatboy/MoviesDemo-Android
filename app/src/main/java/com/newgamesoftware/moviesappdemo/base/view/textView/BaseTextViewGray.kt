package com.newgamesoftware.moviesappdemo.base.view.textView

import android.content.Context
import android.graphics.Color

abstract class BaseTextViewGray(context: Context) : BaseTextView(context) {

    init {
        this.setTextColor(Color.GRAY)
    }
}