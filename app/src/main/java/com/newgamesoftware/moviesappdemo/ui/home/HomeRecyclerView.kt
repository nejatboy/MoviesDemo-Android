package com.newgamesoftware.moviesappdemo.ui.home

import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.appbar.AppBarLayout
import com.newgamesoftware.moviesappdemo.base.view.recyclerView.BaseRecyclerView

class HomeRecyclerView(context: Context) : BaseRecyclerView<HomeLayout, HomeAdapter>(context) {

    init {
        layoutParams = CoordinatorLayout.LayoutParams(CoordinatorLayout.LayoutParams.MATCH_PARENT, CoordinatorLayout.LayoutParams.MATCH_PARENT).apply {
            behavior = AppBarLayout.ScrollingViewBehavior()
        }

        layoutManager = LinearLayoutManager(context)
        adapter = HomeAdapter()
    }


    override val superView: HomeLayout get() {
        return parent.parent as HomeLayout
    }
}