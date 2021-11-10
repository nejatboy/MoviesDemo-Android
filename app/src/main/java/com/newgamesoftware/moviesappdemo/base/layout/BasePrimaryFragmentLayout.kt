package com.newgamesoftware.moviesappdemo.base.layout

import android.content.Context
import com.newgamesoftware.moviesappdemo.base.BaseActivity
import com.newgamesoftware.moviesappdemo.base.fragment.BasePrimaryFragment


@Suppress("UNCHECKED_CAST")
abstract class BasePrimaryFragmentLayout<A: BaseActivity, PF: BasePrimaryFragment<A>>(context: Context): BaseFragmentLayout<A>(context) {

    var primaryFragmentId: String? = null


    val primaryFragment: PF get() {
        return activity.supportFragmentManager.findFragmentByTag(primaryFragmentId) as PF
    }
}