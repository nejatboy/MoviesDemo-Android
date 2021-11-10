package com.newgamesoftware.moviesappdemo.subviews

import android.content.Context
import android.graphics.Color
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.newgamesoftware.moviesappdemo.util.widthRatio

class Divider(context: Context): View(context) {

    init {
        layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, 0.003f.widthRatio).apply {
            matchConstraintPercentWidth = 0.9f
        }

        setBackgroundColor(Color.LTGRAY)
        id = generateViewId()
    }
}