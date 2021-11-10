package com.newgamesoftware.moviesappdemo.subviews.imageViews

import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.newgamesoftware.moviesappdemo.R
import com.newgamesoftware.moviesappdemo.base.view.imageView.BaseImageView

class ImageViewImdb(context: Context) : BaseImageView(context) {

    init {
        layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, ConstraintLayout.LayoutParams.MATCH_CONSTRAINT).apply {
            matchConstraintPercentWidth = 0.2f
            dimensionRatio = "2:1"
        }

        setImageResource(R.drawable.image_imdb)
    }
}