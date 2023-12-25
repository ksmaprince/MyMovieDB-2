package com.demo.mymoviedb_ii.repository

import com.demo.mymoviedb_ii.data.Movie
import com.demo.mymoviedb_ii.data.network.MovieService
import javax.inject.Inject

class MovieRepository @Inject constructor(val movieService: MovieService) {

    suspend fun getMovie(apiKey: String, page:Int): Movie{
        return movieService.getAllMovie(apiKey, page)
    }
}