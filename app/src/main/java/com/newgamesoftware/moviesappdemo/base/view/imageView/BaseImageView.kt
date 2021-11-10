package com.newgamesoftware.moviesappdemo.base.view.imageView

import android.content.Context
import androidx.appcompat.widget.AppCompatImageView

abstract class BaseImageView(context: Context): AppCompatImageView(context) {

    init {
        id = generateViewId()
    }
}