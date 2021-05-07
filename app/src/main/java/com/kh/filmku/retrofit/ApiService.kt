package com.kh.filmku.retrofit

import com.kh.filmku.data.source.remote.response.MovieResponse
import com.kh.filmku.data.source.remote.response.MovieDetailResponse
import com.kh.filmku.data.source.remote.response.TvShowDetailResponse
import com.kh.filmku.data.source.remote.response.TvShowResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    val API_KEY: String
        get() = "caa7cfdf13c67f0ca368e3b13bcf4e9b"

    @GET("discover/movie")
    fun getMovie(
        @Query("api_key") apiKey: String
    ): Call<MovieResponse>

    @GET("discover/tv")
    fun getTvShows(
        @Query("api_key") apiKey: String
    ): Call<TvShowResponse>

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: String,
                     @Query("api_key") apiKey: String
    ): Call<MovieDetailResponse>

    @GET("tv/{tv_id}")
    fun getTvShowDetails(@Path("tv_id") id: String,
                     @Query("api_key") apiKey: String
    ): Call<TvShowDetailResponse>
}