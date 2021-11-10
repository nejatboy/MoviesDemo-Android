package com.newgamesoftware.moviesappdemo.ui.home.top

import com.newgamesoftware.moviesappdemo.base.BaseInteractor
import com.newgamesoftware.moviesappdemo.models.Language

class TopInteractor: BaseInteractor() {

    fun requestFetchNowPlayingList(fragment: TopFragment, page: Int) {
        fragment.activity.webService.fetchNowPlayingList(Language.EN, page) {
            fragment.nowPlayingMoviesFetched(movies = it)
        }
    }
}