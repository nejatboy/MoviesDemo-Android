package com.newgamesoftware.moviesappdemo.ui.home.top

import android.content.Context
import android.graphics.Color
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView
import com.newgamesoftware.moviesappdemo.base.view.recyclerView.BaseRecyclerViewCell
import com.newgamesoftware.moviesappdemo.models.Movie
import com.newgamesoftware.moviesappdemo.subviews.imageViews.ImageViewTop
import com.newgamesoftware.moviesappdemo.subviews.textViews.TextViewCellDescription
import com.newgamesoftware.moviesappdemo.subviews.textViews.TextViewCellTitle
import com.newgamesoftware.moviesappdemo.subviews.textViews.TextViewDetailDescription
import com.newgamesoftware.moviesappdemo.subviews.textViews.TextViewDetailTitle
import com.newgamesoftware.moviesappdemo.util.loadUrl
import com.newgamesoftware.moviesappdemo.util.widthRatio

class TopCell(context: Context) : BaseRecyclerViewCell<TopRecyclerView>(context) {

    private val imageView = ImageViewTop(context).apply {
        alpha = 0.5f
    }

    private val textViewTitle = TextViewCellTitle(context).apply {
        setTextColor(Color.WHITE)
    }

    private val textViewDescription = TextViewCellDescription(context).apply {
        setTextColor(Color.WHITE)
    }


    init {
        layoutParams = RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT)

        setupSubviews()
        setConstraints()
    }


    private fun setupSubviews() {
        addView(imageView)
        addView(textViewTitle)
        addView(textViewDescription)
    }


    private fun setConstraints() {
        val spacing = 0.04f.widthRatio

        set.clone(this)

        set.connect(imageView.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP)
        set.connect(imageView.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END)
        set.connect(imageView.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START)
        set.connect(imageView.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM)

        set.connect(textViewDescription.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, 2 * spacing)
        set.connect(textViewDescription.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, spacing)
        set.connect(textViewDescription.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END, spacing)

        set.connect(textViewTitle.id, ConstraintSet.START, textViewDescription.id, ConstraintSet.START)
        set.connect(textViewTitle.id, ConstraintSet.END, textViewDescription.id, ConstraintSet.END)
        set.connect(textViewTitle.id, ConstraintSet.BOTTOM, textViewDescription.id, ConstraintSet.TOP, spacing)

        set.applyTo(this)
    }


    fun bindMovie(movie: Movie) {
        textViewTitle.text = movie.getTitle
        textViewDescription.text = movie.overview

        val imageUrl = movie.getImageUrl(isPosterPath = false)
        imageView.loadUrl(path = imageUrl)
    }
}