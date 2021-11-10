package com.newgamesoftware.moviesappdemo.base.view.recyclerView

import android.content.Context
import com.newgamesoftware.moviesappdemo.base.layout.BaseConstraintLayout


@Suppress("UNCHECKED_CAST")
abstract class BaseRecyclerViewCell<RV: BaseRecyclerView<*, *>>(context: Context) : BaseConstraintLayout(context) {

    val recyclerView: RV get() {
        return parent as RV
    }
}
