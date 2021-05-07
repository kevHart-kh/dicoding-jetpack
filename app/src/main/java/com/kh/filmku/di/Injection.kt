package com.kh.filmku.di

import android.content.Context
import com.kh.academy.data.source.MovieRepository
import com.kh.academy.data.source.remote.RemoteDataSource
import com.kh.filmku.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): MovieRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return MovieRepository.getInstance(remoteDataSource)
    }
}