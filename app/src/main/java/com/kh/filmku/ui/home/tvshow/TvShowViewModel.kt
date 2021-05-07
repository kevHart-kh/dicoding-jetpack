package com.kh.filmku.ui.home.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kh.academy.data.source.MovieRepository
import com.kh.filmku.data.TvShowEntity

class TvShowViewModel(private val movieRepository: MovieRepository) : ViewModel() {
//    fun getTvShow(): List<TvShowEntity> = DataDummy.generateDummyTvShows()
    fun getTvShow(): LiveData<List<TvShowEntity>> = movieRepository.getAllTvShow()
}