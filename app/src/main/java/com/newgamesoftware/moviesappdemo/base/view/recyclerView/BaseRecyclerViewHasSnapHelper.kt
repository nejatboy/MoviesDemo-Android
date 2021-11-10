package com.newgamesoftware.moviesappdemo.base.view.recyclerView

import android.content.Context
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.newgamesoftware.moviesappdemo.base.layout.BaseConstraintLayout

abstract class BaseRecyclerViewHasSnapHelper<SV: BaseConstraintLayout, A: RecyclerView.Adapter<*>>(context: Context) : BaseRecyclerView<SV, A>(context) {

    init {
        val linearSnapHelper = LinearSnapHelper()
        linearSnapHelper.attachToRecyclerView(this)
    }
}