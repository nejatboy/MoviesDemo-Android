package com.newgamesoftware.moviesappdemo.ui.home.top

import android.content.Context
import android.graphics.Color
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.newgamesoftware.moviesappdemo.base.view.recyclerView.BaseRecyclerViewHasSnapHelper

class TopRecyclerView(context: Context) : BaseRecyclerViewHasSnapHelper<TopLayout, TopAdapter>(context) {

    init {
        layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT)
        layoutManager = GridLayoutManager(context, 1, GridLayoutManager.HORIZONTAL, false)
        adapter = TopAdapter()
    }
}