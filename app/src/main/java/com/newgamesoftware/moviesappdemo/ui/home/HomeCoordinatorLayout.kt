package com.newgamesoftware.moviesappdemo.ui.home

import android.content.Context
import android.graphics.Color
import androidx.constraintlayout.widget.ConstraintLayout
import com.newgamesoftware.moviesappdemo.base.layout.BaseCoordinatorLayout

class HomeCoordinatorLayout(context: Context) : BaseCoordinatorLayout(context) {

    init {
        layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT)
    }
}