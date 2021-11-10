package com.newgamesoftware.moviesappdemo.ui.home

import android.content.Context
import android.graphics.Color
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView
import com.newgamesoftware.moviesappdemo.base.view.recyclerView.BaseRecyclerViewCell
import com.newgamesoftware.moviesappdemo.grapich.AppColor
import com.newgamesoftware.moviesappdemo.grapich.Shape
import com.newgamesoftware.moviesappdemo.models.Movie
import com.newgamesoftware.moviesappdemo.subviews.Divider
import com.newgamesoftware.moviesappdemo.subviews.imageViews.ImageViewHomeCellMovie
import com.newgamesoftware.moviesappdemo.subviews.imageViews.ImageViewRight
import com.newgamesoftware.moviesappdemo.subviews.textViews.TextViewHomeCellDate
import com.newgamesoftware.moviesappdemo.subviews.textViews.TextViewCellDescription
import com.newgamesoftware.moviesappdemo.subviews.textViews.TextViewCellTitle
import com.newgamesoftware.moviesappdemo.util.loadUrl
import com.newgamesoftware.moviesappdemo.util.widthRatio


class HomeCell(context: Context) : BaseRecyclerViewCell<HomeRecyclerView>(context) {

    private val divider = Divider(context)
    private val imageViewMovie = ImageViewHomeCellMovie(context)
    private val imageViewRight = ImageViewRight(context)
    private val textViewTitle = TextViewCellTitle(context)
    private val textViewDescription = TextViewCellDescription(context)
    private val textViewDate = TextViewHomeCellDate(context)


    init {
        layoutParams = RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT)
        background = Shape.states(normalColor = Color.TRANSPARENT, pressedColor = AppColor.cellPressed)

        setupSubviews()
        setConstraints()
    }


    private fun setupSubviews() {
        addView(imageViewMovie)
        addView(imageViewRight)
        addView(textViewDate)
        addView(textViewDescription)
        addView(textViewTitle)
        addView(divider)
    }


    private fun setConstraints() {
        val spacing = 0.04f.widthRatio

        set.clone(this)

        set.connect(imageViewMovie.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, spacing)
        set.connect(imageViewMovie.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, spacing)
        set.connect(imageViewMovie.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, spacing)

        set.centerVertically(imageViewRight.id, ConstraintSet.PARENT_ID)
        set.connect(imageViewRight.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END, spacing)

        set.connect(textViewDate.id, ConstraintSet.END, imageViewRight.id, ConstraintSet.START, spacing)
        set.connect(textViewDate.id, ConstraintSet.BOTTOM, imageViewMovie.id, ConstraintSet.BOTTOM)

        set.connect(textViewTitle.id, ConstraintSet.TOP, imageViewMovie.id, ConstraintSet.TOP)
        set.connect(textViewTitle.id, ConstraintSet.START, imageViewMovie.id, ConstraintSet.END, spacing)
        set.connect(textViewTitle.id, ConstraintSet.END, imageViewRight.id, ConstraintSet.END, spacing)

        set.connect(textViewDescription.id, ConstraintSet.TOP, textViewTitle.id, ConstraintSet.BOTTOM, spacing)
        set.connect(textViewDescription.id, ConstraintSet.START, imageViewMovie.id, ConstraintSet.END, spacing)
        set.connect(textViewDescription.id, ConstraintSet.BOTTOM, textViewDate.id, ConstraintSet.TOP, spacing)
        set.connect(textViewDescription.id, ConstraintSet.END, imageViewRight.id, ConstraintSet.START, spacing)

        set.connect(divider.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM)
        set.centerHorizontally(divider.id, ConstraintSet.PARENT_ID)

        set.applyTo(this)
    }


    fun bindMovie(movie: Movie) {
        textViewTitle.text = movie.getTitle
        textViewDescription.text = movie.overview
        textViewDate.text = movie.releaseDate

        val imageUrl = movie.getImageUrl(isPosterPath = true)
        imageViewMovie.loadUrl(path = imageUrl)
    }
}