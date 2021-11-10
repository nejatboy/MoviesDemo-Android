package com.newgamesoftware.moviesappdemo.ui.home

import android.content.Context
import android.graphics.Color
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.newgamesoftware.moviesappdemo.base.layout.BaseAppBarLayout

class HomeAppBarLayout(context: Context) : BaseAppBarLayout(context) {

    init {
        layoutParams = CoordinatorLayout.LayoutParams(CoordinatorLayout.LayoutParams.MATCH_PARENT, CoordinatorLayout.LayoutParams.WRAP_CONTENT)
        setBackgroundColor(Color.BLACK)
    }
}