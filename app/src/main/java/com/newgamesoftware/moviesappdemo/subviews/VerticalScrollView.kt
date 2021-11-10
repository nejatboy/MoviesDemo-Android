package com.newgamesoftware.moviesappdemo.subviews

import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.setPadding
import com.newgamesoftware.moviesappdemo.base.view.BaseScrollView
import com.newgamesoftware.moviesappdemo.util.widthRatio

class VerticalScrollView(context: Context) : BaseScrollView(context) {

    init {
        layout.layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT).apply {
            setPadding(0.04f.widthRatio)
        }

        layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_CONSTRAINT)
    }
}