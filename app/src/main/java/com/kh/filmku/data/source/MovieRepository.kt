package com.kh.academy.data.source

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kh.academy.data.source.remote.MovieTvDataSource
import com.kh.academy.data.source.remote.RemoteDataSource
import com.kh.filmku.data.MovieEntity
import com.kh.filmku.data.TvShowEntity
import com.kh.filmku.data.source.remote.response.MovieDetailResponse
import com.kh.filmku.data.source.remote.response.ResultsItemMovie
import com.kh.filmku.data.source.remote.response.ResultsItemTV
import com.kh.filmku.data.source.remote.response.TvShowDetailResponse
import java.lang.Exception

class MovieRepository private constructor(private val remoteDataSource: RemoteDataSource) : MovieTvDataSource {
    val TAG = this::class.java.simpleName

    companion object {
        const val IMAGE_BASE_PATH = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2"

        @Volatile
        private var instance: MovieRepository? = null
        fun getInstance(remoteData: RemoteDataSource): MovieRepository =
            instance ?: synchronized(this) {
                instance ?: MovieRepository(remoteData).apply { instance = this }
            }
    }

    override fun getAllMovie(): LiveData<List<MovieEntity>> {
        val movieResults = MutableLiveData<List<MovieEntity>>()

        remoteDataSource.getAllMovie(object: RemoteDataSource.LoadMovieCallback{
            override fun onAllMovieReceived(movieResponses: List<ResultsItemMovie>) {
                val movieList = ArrayList<MovieEntity>()
                for (response in movieResponses) {
                    val movie = MovieEntity(
                        response.id,
                        response.title,
                        "",
                        "",
                        "",
                        response.overview,
                        "",
                        IMAGE_BASE_PATH + response.posterPath
                    )
                    movieList.add(movie)
                }
                movieResults.postValue(movieList)
            }
        })

        return movieResults
    }

    override fun getAllTvShow(): LiveData<List<TvShowEntity>> {
        val tvShowResults = MutableLiveData<List<TvShowEntity>>()

        remoteDataSource.getAllTvShow(object : RemoteDataSource.LoadTvShowCallback{
            override fun onAllTvShowReceived(tvShowResponses: List<ResultsItemTV>) {
                val tvShowList = ArrayList<TvShowEntity>()
                for (response in tvShowResponses) {
                    val tvShow = TvShowEntity(
                        response.id,
                        response.name,
                        "",
                        "",
                        response.overview,
                        "",
                        IMAGE_BASE_PATH + response.posterPath
                    )
                    tvShowList.add(tvShow)
                }
                tvShowResults.postValue(tvShowList)
            }
        })

        return tvShowResults
    }

    override fun getDetailMovie(idMovie :String): LiveData<MovieEntity> {
        val movieResults = MutableLiveData<MovieEntity>()
        Log.d(TAG, idMovie)

        remoteDataSource.getDetailMovie(idMovie, object : RemoteDataSource.LoadDetailMovieCallback{
            override fun onDetailMovieReceived(detailMovieResponses: MovieDetailResponse) {
                var movie = MovieEntity()
                movie.set(detailMovieResponses)

                Log.d(TAG, movie.toString())
                movieResults.postValue(movie)
            }
        })

        Log.d(TAG + "_movie result", movieResults.value.toString())
        return movieResults
    }

    override fun getDetailTvShow(idTvShow: String): LiveData<TvShowEntity> {
        val tvShowResults = MutableLiveData<TvShowEntity>()
        Log.d(TAG, idTvShow)

        remoteDataSource.getDetailTvShow(idTvShow, object : RemoteDataSource.LoadDetailTvShowCallback{
            override fun onDetailTvShowReceived(detailTvShowResponses: TvShowDetailResponse) {
                var tvShow = TvShowEntity()
                tvShow.set(detailTvShowResponses)

                Log.d(TAG, tvShow.toString())
                tvShowResults.postValue(tvShow)
            }
        })

        Log.d(TAG + "_movie result", tvShowResults.value.toString())
        return tvShowResults
    }
}