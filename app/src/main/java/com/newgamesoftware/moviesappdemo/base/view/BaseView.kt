package com.newgamesoftware.moviesappdemo.base.view

import android.content.Context
import com.newgamesoftware.moviesappdemo.base.layout.BaseConstraintLayout

@Suppress("UNCHECKED_CAST")
abstract class BaseView<SV: BaseConstraintLayout>(context: Context) : BaseConstraintLayout(context) {

    init {
        id = generateViewId()
    }


    open val superView: SV get() {
        return parent as SV
    }
}