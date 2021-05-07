package com.kh.academy.data.source.remote

import androidx.lifecycle.LiveData
import com.kh.filmku.data.MovieEntity
import com.kh.filmku.data.TvShowEntity

interface MovieTvDataSource {

    fun getAllMovie(): LiveData<List<MovieEntity>>

    fun getAllTvShow(): LiveData<List<TvShowEntity>>

    fun getDetailMovie(idMovie :String): LiveData<MovieEntity>

    fun getDetailTvShow(idTvShow :String): LiveData<TvShowEntity>
}