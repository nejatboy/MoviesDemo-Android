package com.newgamesoftware.moviesappdemo.subviews.container

import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.setMargins
import com.google.android.material.appbar.AppBarLayout
import com.newgamesoftware.moviesappdemo.base.layout.BaseFrameLayout

class FragmentChildContainer(context: Context) : BaseFrameLayout(context) {

    init {
        layoutParams = AppBarLayout.LayoutParams(AppBarLayout.LayoutParams.MATCH_PARENT, AppBarLayout.LayoutParams.WRAP_CONTENT).apply {
            scrollFlags = AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL or AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS
        }
    }
}