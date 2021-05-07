package com.kh.filmku.ui.home.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kh.academy.data.source.MovieRepository
import com.kh.filmku.data.MovieEntity

class MovieViewModel(private val movieRepository: MovieRepository) : ViewModel() {
    fun getMovie(): LiveData<List<MovieEntity>> = movieRepository.getAllMovie()
}