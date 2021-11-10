package com.newgamesoftware.moviesappdemo.base.fragment

import android.os.Bundle
import android.view.View
import com.newgamesoftware.moviesappdemo.base.BaseActivity
import com.newgamesoftware.moviesappdemo.base.layout.BasePrimaryFragmentLayout


@Suppress("UNCHECKED_CAST")
abstract class BasePrimaryFragment<A: BaseActivity>: BaseFragment<A>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (view as? BasePrimaryFragmentLayout<A, *>)?.primaryFragmentId = id
    }

}