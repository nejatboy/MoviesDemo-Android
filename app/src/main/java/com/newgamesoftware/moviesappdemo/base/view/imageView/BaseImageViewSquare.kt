package com.newgamesoftware.moviesappdemo.base.view.imageView

import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout

abstract class BaseImageViewSquare(context: Context) : BaseImageView(context) {

    init {
        layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, ConstraintLayout.LayoutParams.MATCH_CONSTRAINT).apply {
            dimensionRatio = "1:1"
        }
    }
}