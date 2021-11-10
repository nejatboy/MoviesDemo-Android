package com.newgamesoftware.moviesappdemo.base.view.imageView

import android.content.Context
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.shape.ShapeAppearanceModel


abstract class BaseShapeableImageView(context: Context): ShapeableImageView(context) {

    init {
        id = generateViewId()
    }


    fun setCornerRadius(value: Int) {
        shapeAppearanceModel = ShapeAppearanceModel().withCornerSize(value.toFloat())
    }
}