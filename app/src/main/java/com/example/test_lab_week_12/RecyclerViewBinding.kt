package com.example.test_lab_week_12

import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.test_lab_week_12.model.Movie

class RecyclerViewBinding {

    companion object {

        private const val TAG = "RecyclerViewBinding"

        @JvmStatic
        @BindingAdapter("list")
        fun bindMovies(view: RecyclerView, movies: List<Movie>?) {
            Log.d(TAG, "bindMovies called")
            Log.d(TAG, "movies size = ${movies?.size ?: 0}")

            val adapter = view.adapter as? MovieAdapter
            if (adapter == null) {
                Log.e(TAG, "RecyclerView adapter is null or not MovieAdapter")
                return
            }

            adapter.addMovies(movies ?: emptyList())
        }
    }
}
