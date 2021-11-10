package com.newgamesoftware.moviesappdemo.base.view

import android.content.Context
import android.graphics.Color
import android.widget.ScrollView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.setPadding
import com.newgamesoftware.moviesappdemo.util.widthRatio


abstract class BaseScrollView(context: Context): ScrollView(context) {

    val layout = ConstraintLayout(context).apply {
        id = generateViewId()
    }


    init {
        id = generateViewId()
        this.addView(layout)
    }
}