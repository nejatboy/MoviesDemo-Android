package com.newgamesoftware.moviesappdemo.subviews.imageViews

import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.newgamesoftware.moviesappdemo.base.view.imageView.BaseImageView

class ImageViewTop(context: Context) : BaseImageView(context) {

    init {
        layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, ConstraintLayout.LayoutParams.MATCH_CONSTRAINT).apply {
            dimensionRatio = "1.78"
        }
    }
}