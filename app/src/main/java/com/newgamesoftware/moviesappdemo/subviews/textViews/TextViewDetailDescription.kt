package com.newgamesoftware.moviesappdemo.subviews.textViews

import android.content.Context
import android.graphics.Color
import androidx.constraintlayout.widget.ConstraintLayout
import com.newgamesoftware.moviesappdemo.base.view.textView.BaseTextView
import com.newgamesoftware.moviesappdemo.util.setTextSizeByPx

class TextViewDetailDescription(context: Context) : BaseTextView(context) {

    init {
        layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT)
        setTextSizeByPx(5)
        setTextColor(Color.BLACK)
    }
}