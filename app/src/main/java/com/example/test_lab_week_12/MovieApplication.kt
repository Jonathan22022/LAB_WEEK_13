package com.example.test_lab_week_12

import android.app.Application
import android.util.Log
import com.example.test_lab_week_12.api.MovieService
import com.example.test_lab_week_12.database.MovieDatabase
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class MovieApplication : Application() {
    companion object {
        private const val TAG = "MovieApplication"
    }
    // create a MovieDatabase instance
    lateinit var movieDatabase: MovieDatabase
        private set   

    lateinit var movieRepository: MovieRepository
    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate called")
// create a Retrofit instance
        movieDatabase = MovieDatabase.getInstance(this)
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
// create a MovieService instance
// and bind the MovieService interface to the Retrofit instance
// this allows us to make API calls
        val movieService = retrofit.create(
            MovieService::class.java
        )
        Log.d(TAG, "MovieService created")
// create a MovieRepository instance
        movieRepository = MovieRepository(movieService, movieDatabase)
        Log.d(TAG, "MovieRepository created")
    }
}