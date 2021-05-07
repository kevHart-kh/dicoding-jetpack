package com.kh.filmku.ui.detailMovie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kh.academy.data.source.MovieRepository
import com.kh.filmku.data.MovieEntity

class DetailMovieViewModel(private val movieRepository: MovieRepository) : ViewModel() {

    val TAG = this::class.java.simpleName

    private lateinit var movieId: String

    fun setSelectedMovie(_movie: MovieEntity) {
        this.movieId = _movie.id
    }

    fun getMovie(): LiveData<MovieEntity> = movieRepository.getDetailMovie(movieId)


}