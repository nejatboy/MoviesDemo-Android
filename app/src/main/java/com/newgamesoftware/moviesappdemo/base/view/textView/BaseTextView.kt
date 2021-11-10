package com.newgamesoftware.moviesappdemo.base.view.textView

import android.content.Context
import androidx.appcompat.widget.AppCompatTextView

abstract class BaseTextView(context: Context): AppCompatTextView(context) {

    init {
        id = generateViewId()
    }
}