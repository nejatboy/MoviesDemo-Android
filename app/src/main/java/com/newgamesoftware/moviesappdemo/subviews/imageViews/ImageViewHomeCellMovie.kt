package com.newgamesoftware.moviesappdemo.subviews.imageViews

import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.newgamesoftware.moviesappdemo.base.view.imageView.BaseShapeableImageView
import com.newgamesoftware.moviesappdemo.util.widthRatio

class ImageViewHomeCellMovie(context: Context) : BaseShapeableImageView(context) {

    init {
        layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, ConstraintLayout.LayoutParams.MATCH_CONSTRAINT).apply {
            dimensionRatio = "1:1"
            matchConstraintPercentWidth = 0.3f
        }

        setCornerRadius(value = 0.03f.widthRatio)
    }
}