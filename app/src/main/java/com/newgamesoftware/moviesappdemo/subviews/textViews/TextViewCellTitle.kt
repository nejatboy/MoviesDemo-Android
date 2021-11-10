package com.newgamesoftware.moviesappdemo.subviews.textViews

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.text.TextUtils
import androidx.constraintlayout.widget.ConstraintLayout
import com.newgamesoftware.moviesappdemo.base.view.textView.BaseTextView
import com.newgamesoftware.moviesappdemo.util.setTextSizeByPx

class TextViewCellTitle(context: Context) : BaseTextView(context) {

    init {
        layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, ConstraintLayout.LayoutParams.WRAP_CONTENT)
        setTextSizeByPx(5)
        setTextColor(Color.BLACK)
        typeface = Typeface.DEFAULT_BOLD
        maxLines = 2
        ellipsize = TextUtils.TruncateAt.END
    }

}