package com.newgamesoftware.moviesappdemo.ui

import android.content.Context
import com.newgamesoftware.moviesappdemo.base.layout.BaseActivityLayout
import com.newgamesoftware.moviesappdemo.subviews.container.FragmentContainer

class RootLayout(context: Context) : BaseActivityLayout<RootActivity>(context) {

    val fragmentContainer = FragmentContainer(context)


    init {
        addView(fragmentContainer)
    }
}