package com.example.test_lab_week_12

import androidx.lifecycle.LiveData
import com.example.test_lab_week_12.api.MovieService
import androidx.lifecycle.MutableLiveData
import com.example.test_lab_week_12.model.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class MovieRepository(private val movieService: MovieService) {
    private val apiKey = "8a6981ca2124ec65ed3fcfcb057f67d2"


    // fetch movies from the API
    // fetch movies from the API
// this function returns a Flow of Movie objects
// a Flow is a type of coroutine that can emit multiple values
// for more info, see: https://kotlinlang.org/docs/flow.html#flows
    fun fetchMovies(): Flow<List<Movie>> {
        return flow {
            val movies = movieService.getPopularMovies(apiKey).results
// emit the list of popular movies from the API
            emit(movies.sortedByDescending { it.popularity })
        // use Dispatchers.IO to run this coroutine on a shared pool of threads
        }.flowOn(Dispatchers.IO)
    }
}