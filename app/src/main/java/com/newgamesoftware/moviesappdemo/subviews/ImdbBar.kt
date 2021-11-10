package com.newgamesoftware.moviesappdemo.subviews

import android.content.Context
import android.graphics.Color
import androidx.constraintlayout.widget.ConstraintSet
import com.newgamesoftware.moviesappdemo.base.view.BaseView
import com.newgamesoftware.moviesappdemo.models.Movie
import com.newgamesoftware.moviesappdemo.subviews.imageViews.ImageViewImdb
import com.newgamesoftware.moviesappdemo.subviews.imageViews.ImageViewStar
import com.newgamesoftware.moviesappdemo.subviews.textViews.TextViewImdb
import com.newgamesoftware.moviesappdemo.ui.detail.DetailLayout
import com.newgamesoftware.moviesappdemo.util.widthRatio

class ImdbBar(context: Context) : BaseView<DetailLayout>(context) {

    private val imageViewImdb = ImageViewImdb(context)
    private val imageViewStar = ImageViewStar(context)
    private val textViewPoint = TextViewImdb(context)
    private val textViewDate = TextViewImdb(context)
    private val textViewOver = TextViewImdb(context).apply {
        text = "/10"
        setTextColor(Color.GRAY)
    }


    init {
        layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)

        setupSubviews()
        setConstraints()
    }


    private fun setupSubviews() {
        addView(imageViewImdb)
        addView(imageViewStar)
        addView(textViewPoint)
        addView(textViewOver)
        addView(textViewDate)
    }


    private fun setConstraints() {
        val spacing = 0.02f.widthRatio

        set.clone(this)

        set.connect(imageViewImdb.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START)
        set.connect(imageViewImdb.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, spacing)
        set.connect(imageViewImdb.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, spacing)

        set.connect(imageViewStar.id, ConstraintSet.START, imageViewImdb.id, ConstraintSet.END, spacing)
        set.centerVertically(imageViewStar.id, ConstraintSet.PARENT_ID)

        set.centerVertically(textViewPoint.id, ConstraintSet.PARENT_ID)
        set.connect(textViewPoint.id, ConstraintSet.START, imageViewStar.id, ConstraintSet.END, spacing)

        set.centerVertically(textViewOver.id, ConstraintSet.PARENT_ID)
        set.connect(textViewOver.id, ConstraintSet.START, textViewPoint.id, ConstraintSet.END)

        set.centerVertically(textViewDate.id, ConstraintSet.PARENT_ID)
        set.connect(textViewDate.id, ConstraintSet.START, textViewOver.id, ConstraintSet.END, 2 * spacing)

        set.applyTo(this)
    }


    override val superView: DetailLayout get() {
        return parent.parent.parent as DetailLayout
    }


    fun bindMovie(movie: Movie) {
        textViewPoint.text = "${movie.voteAverage}"
        textViewDate.text = movie.releaseDate
    }
}