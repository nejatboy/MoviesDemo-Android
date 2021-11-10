package com.newgamesoftware.moviesappdemo.base.view.recyclerView

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.newgamesoftware.moviesappdemo.base.layout.BaseConstraintLayout


@Suppress("UNCHECKED_CAST")
abstract class BaseRecyclerView<SV: BaseConstraintLayout, A: RecyclerView.Adapter<*>>(context: Context): RecyclerView(context) {

    init {
        id = generateViewId()
    }


    open val superView : SV get() {
        return parent as SV
    }


    val recyclerAdapter : A get() {
        return adapter as A
    }
}