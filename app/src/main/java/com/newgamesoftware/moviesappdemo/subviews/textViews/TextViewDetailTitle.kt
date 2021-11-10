package com.newgamesoftware.moviesappdemo.subviews.textViews

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import androidx.constraintlayout.widget.ConstraintLayout
import com.newgamesoftware.moviesappdemo.base.view.textView.BaseTextView
import com.newgamesoftware.moviesappdemo.util.setTextSizeByPx

class TextViewDetailTitle(context: Context) : BaseTextView(context) {

    init {
        layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT)
        setTextSizeByPx(7)
        setTextColor(Color.BLACK)
        typeface = Typeface.DEFAULT_BOLD
    }
}