package com.demo.mymoviedb_ii.data.network

import com.demo.mymoviedb_ii.data.Movie
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {

    @GET("3/movie/popular")
    suspend fun getAllMovie(@Query("api_key") apiKey: String, @Query("page") page: Int): Movie
}