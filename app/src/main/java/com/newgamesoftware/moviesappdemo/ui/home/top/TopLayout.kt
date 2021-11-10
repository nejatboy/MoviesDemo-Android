package com.newgamesoftware.moviesappdemo.ui.home.top

import android.content.Context
import androidx.constraintlayout.widget.ConstraintSet
import com.newgamesoftware.moviesappdemo.base.layout.BaseSecondaryFragmentLayout
import com.newgamesoftware.moviesappdemo.ui.RootActivity
import com.newgamesoftware.moviesappdemo.ui.home.HomeFragment

class TopLayout(context: Context) : BaseSecondaryFragmentLayout<RootActivity, HomeFragment, TopFragment>(context) {

    val recyclerView = TopRecyclerView(context)




    init {
        setupSubviews()
        setConstraints()
    }


    private fun setupSubviews() {
        addView(recyclerView)
    }


    private fun setConstraints() {
        set.clone(this)

        set.connect(recyclerView.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP)
        set.connect(recyclerView.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM)

        set.applyTo(this)
    }
}