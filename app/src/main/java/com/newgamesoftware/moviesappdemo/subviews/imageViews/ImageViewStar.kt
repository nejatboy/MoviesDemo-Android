package com.newgamesoftware.moviesappdemo.subviews.imageViews

import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.newgamesoftware.moviesappdemo.R
import com.newgamesoftware.moviesappdemo.base.view.imageView.BaseImageViewSquare

class ImageViewStar(context: Context) : BaseImageViewSquare(context) {

    init {
        (layoutParams as ConstraintLayout.LayoutParams).matchConstraintPercentWidth = 0.07f
        setImageResource(R.drawable.icon_star)
    }
}