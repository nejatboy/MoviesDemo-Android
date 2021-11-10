package com.newgamesoftware.moviesappdemo.base.layout

import android.content.Context
import androidx.coordinatorlayout.widget.CoordinatorLayout

abstract class BaseCoordinatorLayout(context: Context): CoordinatorLayout(context) {

    init {
        id = generateViewId()
    }
}