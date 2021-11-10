package com.newgamesoftware.moviesappdemo.services

import com.newgamesoftware.moviesappdemo.models.Language
import com.newgamesoftware.moviesappdemo.models.Movie
import com.newgamesoftware.moviesappdemo.models.MoviesResponseModel
import java.net.HttpURLConnection
import java.net.URL

class RootWebService: BaseWebService() {

    fun fetchNowPlayingList(language: Language, page: Int, completion: (ArrayList<Movie>) -> Unit) {
        val url = URL(baseURL + "3/movie/now_playing?api_key=$apiKey&language=${language.value}&page=$page")

        (url.openConnection() as? HttpURLConnection)?.let {
            fire<MoviesResponseModel>(it) { responseModel ->
                if (responseModel.movies.isEmpty()) {
                    messageListener?.invoke("Bir hata oluştu.")
                    return@fire
                }

                completion.invoke(responseModel.movies)
            }
        }
    }


    fun fetchUpcoming(language: Language, page: Int, completion: (ArrayList<Movie>) -> Unit) {
        val url = URL(baseURL + "3/movie/upcoming?api_key=$apiKey&language=${language.value}&page=$page")

        (url.openConnection() as? HttpURLConnection)?.let {
            fire<MoviesResponseModel>(it) { responseModel ->
                if (responseModel.movies.isEmpty()) {
                    messageListener?.invoke("Bir hata oluştu.")
                    return@fire
                }

                completion.invoke(responseModel.movies)
            }
        }
    }
}