package com.newgamesoftware.moviesappdemo.ui.home

import com.newgamesoftware.moviesappdemo.base.BaseInteractor
import com.newgamesoftware.moviesappdemo.models.Language

class HomeInteractor: BaseInteractor() {

    fun requestFetchUpComingList(fragment: HomeFragment, page: Int) {
        fragment.activity.webService.fetchUpcoming(Language.EN, page) {
            fragment.upComingMoviesFetched(movies = it)
        }
    }
}