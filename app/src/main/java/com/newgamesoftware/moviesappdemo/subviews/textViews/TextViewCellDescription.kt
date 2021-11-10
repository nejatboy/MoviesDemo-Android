package com.newgamesoftware.moviesappdemo.subviews.textViews

import android.content.Context
import android.text.TextUtils
import androidx.constraintlayout.widget.ConstraintLayout
import com.newgamesoftware.moviesappdemo.base.view.textView.BaseTextViewGray
import com.newgamesoftware.moviesappdemo.util.setTextSizeByPx

class TextViewCellDescription(context: Context) : BaseTextViewGray(context) {

    init {
        layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, ConstraintLayout.LayoutParams.WRAP_CONTENT)
        setTextSizeByPx(4)
        maxLines = 2
        ellipsize = TextUtils.TruncateAt.END
    }
}