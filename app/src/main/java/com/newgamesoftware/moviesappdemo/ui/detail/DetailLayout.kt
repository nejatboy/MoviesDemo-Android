package com.newgamesoftware.moviesappdemo.ui.detail

import android.content.Context
import androidx.constraintlayout.widget.ConstraintSet
import com.newgamesoftware.moviesappdemo.base.layout.BasePrimaryFragmentLayout
import com.newgamesoftware.moviesappdemo.subviews.ImdbBar
import com.newgamesoftware.moviesappdemo.subviews.VerticalScrollView
import com.newgamesoftware.moviesappdemo.subviews.imageViews.ImageViewTop
import com.newgamesoftware.moviesappdemo.subviews.textViews.TextViewDetailDescription
import com.newgamesoftware.moviesappdemo.subviews.textViews.TextViewDetailTitle
import com.newgamesoftware.moviesappdemo.ui.RootActivity
import com.newgamesoftware.moviesappdemo.util.widthRatio

class DetailLayout(context: Context) : BasePrimaryFragmentLayout<RootActivity, DetailFragment>(context) {

    val imageView = ImageViewTop(context)
    private val scrollView = VerticalScrollView(context)

    val imdbBar = ImdbBar(context)
    val textViewTitle = TextViewDetailTitle(context)
    val textViewDescription = TextViewDetailDescription(context)


    init {
        setupSubviews()
        setConstraintsOfScrollView()
        setConstraints()
    }


    private fun setupSubviews() {
        scrollView.layout.addView(imdbBar)
        scrollView.layout.addView(textViewTitle)
        scrollView.layout.addView(textViewDescription)

        addView(imageView)
        addView(scrollView)
    }


    private fun setConstraintsOfScrollView() {
        val spacing = 0.04f.widthRatio

        set.clone(scrollView.layout)

        set.connect(imdbBar.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP)

        set.connect(textViewTitle.id, ConstraintSet.TOP, imdbBar.id, ConstraintSet.BOTTOM, spacing)
        set.connect(textViewDescription.id, ConstraintSet.TOP, textViewTitle.id, ConstraintSet.BOTTOM, spacing)
        set.connect(textViewDescription.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM)

        set.applyTo(scrollView.layout)
    }


    private fun setConstraints() {
        set.clone(this)

        set.connect(imageView.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP)
        set.connect(imageView.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START)
        set.connect(imageView.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END)

        set.connect(scrollView.id, ConstraintSet.TOP, imageView.id, ConstraintSet.BOTTOM)
        set.connect(scrollView.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM)

        set.applyTo(this)
    }
}