package com.newgamesoftware.moviesappdemo.base.layout

import android.content.Context
import com.google.android.material.appbar.AppBarLayout

abstract class BaseAppBarLayout(context: Context): AppBarLayout(context) {

    init {
        id = generateViewId()
    }
}