package com.demo.mymoviedb_ii.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.demo.mymoviedb_ii.data.Movie
import com.demo.mymoviedb_ii.data.MovieInfo
import com.demo.mymoviedb_ii.repository.MovieRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MovieViewModel @Inject constructor(val movieRepository: MovieRepository): ViewModel(){

    val _movie = MutableLiveData<Movie>()
    val movie: LiveData<Movie>
        get() = _movie

    fun fetchMovies(apiKey: String, page:Int){
        viewModelScope.launch {
            _movie.value = movieRepository.getMovie(apiKey = apiKey, page = page)
        }
    }

    val _movieInfo = MutableLiveData<MovieInfo>()
    val movieInfo: LiveData<MovieInfo>
        get() = _movieInfo

    fun setMovieInfo(movieInfo: MovieInfo){
        _movieInfo.value = movieInfo
    }

}