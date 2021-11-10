package com.newgamesoftware.moviesappdemo.base.view.recyclerView

import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerAdapter<RV: BaseRecyclerView<*, *>, C: BaseRecyclerViewCell<RV>>: RecyclerView.Adapter<BaseRecyclerAdapter<RV, C>.Holder>() {

    inner class Holder(cell: C) : BaseRecyclerViewHolder<C>(cell)

    var request: ((page: Int) -> Unit)? = null

}