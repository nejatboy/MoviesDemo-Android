package com.newgamesoftware.moviesappdemo.base.layout

import android.content.Context
import com.newgamesoftware.moviesappdemo.base.BaseActivity
import com.newgamesoftware.moviesappdemo.base.fragment.BasePrimaryFragment
import com.newgamesoftware.moviesappdemo.base.fragment.BaseSecondaryFragment


@Suppress("UNCHECKED_CAST")
abstract class BaseSecondaryFragmentLayout<A: BaseActivity, PF: BasePrimaryFragment<A>, SF: BaseSecondaryFragment<A, PF>>(context: Context) : BaseFragmentLayout<A>(context) {

    var primaryFragmentId: String? = null
    var secondaryFragmentId: String? = null


    val primaryFragment: PF get() {
        return activity.supportFragmentManager.findFragmentByTag(primaryFragmentId) as PF
    }


    val secondaryFragment: SF get() {
        return primaryFragment.childFragmentManager.findFragmentByTag(secondaryFragmentId) as SF
    }

}
