package com.newgamesoftware.moviesappdemo.ui.home.top

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.newgamesoftware.moviesappdemo.base.fragment.BaseSecondaryFragment
import com.newgamesoftware.moviesappdemo.models.Movie
import com.newgamesoftware.moviesappdemo.ui.RootActivity
import com.newgamesoftware.moviesappdemo.ui.home.HomeFragment

class TopFragment: BaseSecondaryFragment<RootActivity, HomeFragment>() {

    private val layout by lazy { TopLayout(context = requireContext()) }
    private val interactor = TopInteractor()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        layout.recyclerView.recyclerAdapter.request = ::request
        return layout
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        request(page = 1)
    }


    private fun request(page: Int) {
        interactor.requestFetchNowPlayingList(fragment = this, page = page)
    }


    fun nowPlayingMoviesFetched(movies: ArrayList<Movie>) {
        layout.recyclerView.recyclerAdapter.addMovies(newList = movies)
    }
}