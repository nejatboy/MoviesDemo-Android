package com.newgamesoftware.moviesappdemo.base.layout

import android.content.Context
import android.widget.FrameLayout

abstract class BaseFrameLayout(context: Context): FrameLayout(context) {

    init {
        id = generateViewId()
    }
}