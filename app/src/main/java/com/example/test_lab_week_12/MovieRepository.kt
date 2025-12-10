package com.example.test_lab_week_12

import androidx.lifecycle.LiveData
import com.example.test_lab_week_12.api.MovieService
import androidx.lifecycle.MutableLiveData
import com.example.test_lab_week_12.database.MovieDao
import com.example.test_lab_week_12.database.MovieDatabase
import com.example.test_lab_week_12.model.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import android.util.Log

class MovieRepository(private val movieService: MovieService, private val movieDatabase: MovieDatabase) {
    private val apiKey = "8a6981ca2124ec65ed3fcfcb057f67d2"


    // fetch movies from the API
    // fetch movies from the API
// this function returns a Flow of Movie objects
// a Flow is a type of coroutine that can emit multiple values
// for more info, see: https://kotlinlang.org/docs/flow.html#flows
    companion object {
        private const val TAG = "MovieRepository"
    }

    fun fetchMovies(): Flow<List<Movie>> {
        return flow {
            Log.d(TAG, "fetchMovies started")
// Check if there are movies saved in the database
            val movieDao: MovieDao = movieDatabase.movieDao()
            Log.d(TAG, "MovieDao obtained")
            val savedMovies = movieDao.getMovies()
            Log.d(TAG, "Saved movies from DB: ${savedMovies.size}")
// If there are no movies saved in the database,
// fetch the list of popular movies from the API
            if(savedMovies.isEmpty()) {
                Log.d(TAG, "DB empty → fetching from API")
                val movies = movieService.getPopularMovies(apiKey).results
                Log.d(TAG, "Movies from API: ${movies.size}")
// save the list of popular movies to the database
                movieDao.addMovies(movies)
                Log.d(TAG, "Movies saved to DB")
// emit the list of popular movies from the API
                emit(movies)
                Log.d(TAG, "Emitted movies from API")
            } else {
                Log.d(TAG, "Using movies from DB")
// If there are movies saved in the database,
// emit the list of saved movies from the database
                emit(savedMovies)
            }
        }.flowOn(Dispatchers.IO)
    }
}