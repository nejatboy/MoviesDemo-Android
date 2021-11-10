package com.newgamesoftware.moviesappdemo.base.layout

import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet


abstract class BaseConstraintLayout(context: Context): ConstraintLayout(context) {

    val set = ConstraintSet()

}