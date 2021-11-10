package com.newgamesoftware.moviesappdemo.subviews.imageViews

import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.newgamesoftware.moviesappdemo.R
import com.newgamesoftware.moviesappdemo.base.view.imageView.BaseImageView

class ImageViewRight(context: Context) : BaseImageView(context) {

    init {
        layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, ConstraintLayout.LayoutParams.MATCH_CONSTRAINT).apply {
            dimensionRatio = "1:1"
            matchConstraintPercentWidth = 0.05f
        }

        setImageResource(R.drawable.icon_right)
    }
}