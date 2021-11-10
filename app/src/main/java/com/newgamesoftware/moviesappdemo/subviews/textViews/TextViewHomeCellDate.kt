package com.newgamesoftware.moviesappdemo.subviews.textViews

import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.newgamesoftware.moviesappdemo.base.view.textView.BaseTextViewGray
import com.newgamesoftware.moviesappdemo.util.setTextSizeByPx

class TextViewHomeCellDate(context: Context) : BaseTextViewGray(context) {

    init {
        layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT)
        setTextSizeByPx(3)
    }
}