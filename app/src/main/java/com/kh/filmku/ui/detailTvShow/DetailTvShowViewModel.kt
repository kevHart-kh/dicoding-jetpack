package com.kh.filmku.ui.detailTvShow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kh.academy.data.source.MovieRepository
import com.kh.filmku.data.TvShowEntity

class DetailTvShowViewModel(private val movieRepository: MovieRepository) : ViewModel() {

    val TAG = this::class.java.simpleName

    private lateinit var tvShowid: String

    fun setSelectedTvShow(_tvShow: TvShowEntity) {
        this.tvShowid = _tvShow.id
    }

    fun getTvShow(): LiveData<TvShowEntity> = movieRepository.getDetailTvShow(tvShowid)
}