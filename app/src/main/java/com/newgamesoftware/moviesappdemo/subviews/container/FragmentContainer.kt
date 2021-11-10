package com.newgamesoftware.moviesappdemo.subviews.container

import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import com.newgamesoftware.moviesappdemo.base.layout.BaseFrameLayout

class FragmentContainer(context: Context) : BaseFrameLayout(context) {

    init {
        layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT)
        ViewCompat.setElevation(this, 20f)
    }

}