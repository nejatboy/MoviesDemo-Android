package com.newgamesoftware.moviesappdemo.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.newgamesoftware.moviesappdemo.base.fragment.BasePrimaryFragment
import com.newgamesoftware.moviesappdemo.models.Movie
import com.newgamesoftware.moviesappdemo.ui.RootActivity
import com.newgamesoftware.moviesappdemo.util.loadUrl


class DetailFragment: BasePrimaryFragment<RootActivity>() {

    private val layout by lazy { DetailLayout(context = requireContext()) }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return layout
    }


    fun setMovie(movie: Movie) {
        layout.textViewTitle.text = movie.getTitle
        layout.textViewDescription.text = movie.overview
        layout.imdbBar.bindMovie(movie)

        val imageUrl = movie.getImageUrl(isPosterPath = false)
        layout.imageView.loadUrl(path = imageUrl)
    }
}