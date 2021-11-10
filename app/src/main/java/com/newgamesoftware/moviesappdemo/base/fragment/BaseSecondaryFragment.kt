package com.newgamesoftware.moviesappdemo.base.fragment

import android.os.Bundle
import android.view.View
import com.newgamesoftware.moviesappdemo.base.BaseActivity
import com.newgamesoftware.moviesappdemo.base.layout.BaseSecondaryFragmentLayout


@Suppress("UNCHECKED_CAST")
abstract class BaseSecondaryFragment<A: BaseActivity, PF: BasePrimaryFragment<A>>: BasePrimaryFragment<A>() {

    val primaryFragment: PF get() {
        return parentFragment as PF
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (view as? BaseSecondaryFragmentLayout<A, PF, *>)?.let {
            it.primaryFragmentId = primaryFragment.id
            it.secondaryFragmentId = id
        }
    }
}