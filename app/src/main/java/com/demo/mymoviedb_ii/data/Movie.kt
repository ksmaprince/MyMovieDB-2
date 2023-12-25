package com.demo.mymoviedb_ii.data

import java.io.Serializable

data class Movie(
    val page: Int,
    val results: List<MovieInfo>,
    val total_pages: Int,
    val total_results: Int

)
data class MovieInfo(
    val id: Int,
    val title: String,
    val overview: String,
    val poster_path: String,
    val release_date: String,
    val vote_average: Double,
    val vote_count: Int,
    val adult: Boolean
)