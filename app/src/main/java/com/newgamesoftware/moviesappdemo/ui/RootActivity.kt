package com.newgamesoftware.moviesappdemo.ui

import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.newgamesoftware.moviesappdemo.base.BaseActivity
import com.newgamesoftware.moviesappdemo.models.Movie
import com.newgamesoftware.moviesappdemo.ui.detail.DetailFragment
import com.newgamesoftware.moviesappdemo.ui.home.HomeFragment


class RootActivity : BaseActivity() {

    private val layout by lazy { RootLayout(context = this) }

    private val homeFragment = HomeFragment()
    private val detailFragment = DetailFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout)

        setupFragments()
    }


    private fun setupFragments() {
        supportFragmentManager.beginTransaction()
            .add(layout.fragmentContainer.id, homeFragment, homeFragment.id)
            .hide(detailFragment).add(layout.fragmentContainer.id, detailFragment, detailFragment.id)
            .commit()
    }


    fun showDetailFragment(movie: Movie) {
        supportFragmentManager.beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .show(detailFragment)
            .hide(homeFragment)
            .addToBackStack(null)
            .commit()

        detailFragment.setMovie(movie = movie)
    }
}