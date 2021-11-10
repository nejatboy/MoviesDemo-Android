package com.newgamesoftware.moviesappdemo.subviews

import android.content.Context
import android.view.Gravity
import android.widget.ProgressBar
import com.newgamesoftware.moviesappdemo.base.layout.BaseFrameLayout

class ProgressView(context: Context) : BaseFrameLayout(context) {

    var isShowingProgress = false


    private val progressBar = ProgressBar(context).apply {
        layoutParams = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT).apply {
            gravity = Gravity.CENTER
        }
    }


    init {
        isClickable = true
        visibility = GONE

        addView(progressBar)
    }


    fun hide() {
        isShowingProgress = false
        visibility = GONE
    }


    fun show() {
        isShowingProgress = true
        visibility = VISIBLE
    }
}