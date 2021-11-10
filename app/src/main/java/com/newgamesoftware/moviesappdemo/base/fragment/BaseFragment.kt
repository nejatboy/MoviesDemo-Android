package com.newgamesoftware.moviesappdemo.base.fragment


import androidx.fragment.app.Fragment
import com.newgamesoftware.moviesappdemo.base.BaseActivity
import java.util.*

@Suppress("UNCHECKED_CAST")
abstract class BaseFragment<A: BaseActivity>: Fragment() {

    val id = UUID.randomUUID().toString()


    val activity: A get() {
        return getActivity() as A
    }


    fun showMessage(text: String) {
        activity.showMessage(text)
    }


    fun showProgress() {
        activity.showProgress()
    }


    fun hideProgress() {
        activity.hideProgress()
    }
}