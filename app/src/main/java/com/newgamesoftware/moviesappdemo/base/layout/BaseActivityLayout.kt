package com.newgamesoftware.moviesappdemo.base.layout

import android.content.Context
import com.newgamesoftware.moviesappdemo.base.BaseActivity


@Suppress("UNCHECKED_CAST")
abstract class BaseActivityLayout<A: BaseActivity>(context: Context) : BaseConstraintLayout(context){

    val activity : A? get() {
        return context as? A
    }
}