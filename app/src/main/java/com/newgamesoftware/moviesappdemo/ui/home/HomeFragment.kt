package com.newgamesoftware.moviesappdemo.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.newgamesoftware.moviesappdemo.base.fragment.BasePrimaryFragment
import com.newgamesoftware.moviesappdemo.models.Movie
import com.newgamesoftware.moviesappdemo.ui.RootActivity
import com.newgamesoftware.moviesappdemo.ui.home.top.TopFragment

class HomeFragment: BasePrimaryFragment<RootActivity>() {

    private val layout by lazy { HomeLayout(context = requireContext()) }
    private val interactor = HomeInteractor()

    private val topFragment = TopFragment()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        layout.recyclerView.recyclerAdapter.request = ::request
        return layout
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupTopFragment()

        request(page = 1)
    }


    private fun request(page: Int) {
        showProgress()
        interactor.requestFetchUpComingList(fragment = this, page = page)
    }


    private fun setupTopFragment() {
        childFragmentManager.beginTransaction()
            .add(layout.fragmentContainer.id, topFragment, topFragment.id)
            .commit()
    }


    fun onItemMovieClicked(movie: Movie) {
        activity.showDetailFragment(movie = movie)
    }


    fun upComingMoviesFetched(movies: ArrayList<Movie>) {
        layout.recyclerView.recyclerAdapter.addMovies(newList = movies)
        hideProgress()
    }
}
