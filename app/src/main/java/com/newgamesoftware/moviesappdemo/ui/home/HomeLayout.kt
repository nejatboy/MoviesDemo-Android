package com.newgamesoftware.moviesappdemo.ui.home

import android.content.Context
import android.graphics.Color
import com.newgamesoftware.moviesappdemo.base.layout.BasePrimaryFragmentLayout
import com.newgamesoftware.moviesappdemo.subviews.container.FragmentChildContainer
import com.newgamesoftware.moviesappdemo.ui.RootActivity


class HomeLayout(context: Context) : BasePrimaryFragmentLayout<RootActivity, HomeFragment>(context) {

    private val coordinatorLayout = HomeCoordinatorLayout(context)
    private val appBarLayout = HomeAppBarLayout(context)
    val fragmentContainer = FragmentChildContainer(context)
    val recyclerView = HomeRecyclerView(context)


    init {
        setupSubviews()
    }


    private fun setupSubviews() {
        appBarLayout.addView(fragmentContainer)

        coordinatorLayout.addView(appBarLayout)
        coordinatorLayout.addView(recyclerView)

        addView(coordinatorLayout)
    }
}