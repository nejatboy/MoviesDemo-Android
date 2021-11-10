package com.newgamesoftware.moviesappdemo.util


import android.util.TypedValue
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso


// TextView
fun TextView.setTextSizeByPx(value: Int) {
    val multiplier = 0.004f
    val size = Device.width * (0.02f + (value * multiplier))
    setTextSize(TypedValue.COMPLEX_UNIT_PX, size)
}


// Float
val Float.widthRatio: Int get() = (Device.width * this).toInt()
val Float.heightRatio: Int get() = (Device.height * this).toInt()



// ImageView
fun ImageView.loadUrl(path: String?) {
    Picasso.get().load(path).fit().into(this)
}