package com.newgamesoftware.moviesappdemo.models

import com.google.gson.annotations.SerializedName

data class MoviesResponseModel (
    val dates: Date,
    val page: Long,

    @SerializedName("results")
    val movies: ArrayList<Movie>,

    @SerializedName("total_pages")
    val totalPages: Long,

    @SerializedName("total_results")
    val totalResults: Long
)