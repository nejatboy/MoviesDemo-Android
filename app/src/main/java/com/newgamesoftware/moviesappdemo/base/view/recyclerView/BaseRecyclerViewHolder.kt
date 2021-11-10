package com.newgamesoftware.moviesappdemo.base.view.recyclerView

import androidx.recyclerview.widget.RecyclerView


@Suppress("UNCHECKED_CAST")
abstract class BaseRecyclerViewHolder<C: BaseRecyclerViewCell<*>>(cell: C): RecyclerView.ViewHolder(cell) {

    val cell: C get() {
        return itemView as C
    }

}