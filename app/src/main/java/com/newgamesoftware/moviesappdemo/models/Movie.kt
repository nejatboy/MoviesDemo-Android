package com.newgamesoftware.moviesappdemo.models

import com.google.gson.annotations.SerializedName

data class Movie (
    @SerializedName("adult")
    val isItForAdults: Boolean,

    @SerializedName("backdrop_path")
    val backdropPath: String?,

    @SerializedName("genre_ids")
    val genreIds: ArrayList<Long>,

    val id: Long,

    @SerializedName("original_language")
    val originalLanguage: String,

    @SerializedName("original_title")
    val originalTitle: String,

    val overview: String,
    val popularity: Double,

    @SerializedName("poster_path")
    val posterPath: String?,

    @SerializedName("release_date")
    val releaseDate: String,

    val title: String,

    @SerializedName("video")
    val hasVideo: Boolean,

    @SerializedName("vote_average")
    val voteAverage: Double,

    @SerializedName("vote_count")
    val voteCount: Long
) {

    val getTitle: String get() {
        val year = releaseDate.split("-").first()
        return "$title ($year)"
    }


    fun getImageUrl(isPosterPath: Boolean) : String? {
        val imageId = if (isPosterPath) posterPath else backdropPath

        imageId?.let {
            return "https://image.tmdb.org/t/p/w500$imageId"
        }

        return null
    }
}