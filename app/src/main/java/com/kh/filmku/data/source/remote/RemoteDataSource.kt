package com.kh.academy.data.source.remote

import android.util.Log
import com.kh.filmku.data.source.remote.response.*
import com.kh.filmku.retrofit.ApiConfig
import com.kh.filmku.utils.JsonHelper
import org.json.JSONException
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteDataSource(private val jsonHelper: JsonHelper) {

    val TAG = this::class.java.simpleName

    companion object {
        const val API_KEY = "caa7cfdf13c67f0ca368e3b13bcf4e9b"

        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(helper).apply { instance = this }
            }
    }

    fun getAllMovie(callback: LoadMovieCallback) {
        try {
            val client = ApiConfig.getApiService().getMovie(API_KEY)
            client.enqueue(object : Callback<MovieResponse> {
                override fun onResponse(
                    call: Call<MovieResponse>,
                    response: Response<MovieResponse>
                ) {
                    if (response.isSuccessful) {
                        if (response.body() != null) {
                            callback.onAllMovieReceived(response.body()!!.results)
                        }
                    } else {
                        Log.e(JsonHelper.TAG, "onFailure: ${response.message()}")
                    }
                }

                override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                    Log.e(JsonHelper.TAG, "onFailure: ${t.message.toString()}")
                }
            })


        } catch (e: JSONException) {
            e.printStackTrace()
        }
    }

    fun getAllTvShow(callback: LoadTvShowCallback) {
        try {
            val client = ApiConfig.getApiService().getTvShows(API_KEY)
            client.enqueue(object : Callback<TvShowResponse> {
                override fun onResponse(
                    call: Call<TvShowResponse>,
                    response: Response<TvShowResponse>
                ) {
                    if (response.isSuccessful) {
                        if (response.body() != null) {
                            callback.onAllTvShowReceived(response.body()!!.results)
                        }
                    } else {
                        Log.e(TAG, "onFailure: ${response.message()}")
                    }
                }

                override fun onFailure(call: Call<TvShowResponse>, t: Throwable) {
                    Log.e(TAG, "onFailure: ${t.message.toString()}")
                }
            })


        } catch (e: JSONException) {
            e.printStackTrace()
        }
    }

    fun getDetailMovie(idMovie: String, callback: LoadDetailMovieCallback) {
        try {
            val client = ApiConfig.getApiService().getMovieDetails(idMovie, API_KEY)
            client.enqueue(object : Callback<MovieDetailResponse> {
                override fun onResponse(call: Call<MovieDetailResponse>,response: Response<MovieDetailResponse>) {
                    if (response.isSuccessful) {
                        if (response.body() != null) {
                            Log.d(TAG, response.body()!!.toString())
                            callback.onDetailMovieReceived(response.body()!!)
                        }
                    } else {
                        Log.e(TAG, "onFailure: ${response.message()}")
                    }
                }

                override fun onFailure(call: Call<MovieDetailResponse>, t: Throwable) {
                    Log.e(TAG, "onFailure: ${t.message.toString()}")
                }
            })
        } catch (e: JSONException) {
            e.printStackTrace()
        }
    }

    fun getDetailTvShow(idTvShow: String, callback: LoadDetailTvShowCallback) {
        try {
            val client = ApiConfig.getApiService().getTvShowDetails(idTvShow, API_KEY)
            client.enqueue(object : Callback<TvShowDetailResponse> {
                override fun onResponse(call: Call<TvShowDetailResponse>, response: Response<TvShowDetailResponse>) {
                    if (response.isSuccessful) {
                        if (response.body() != null) {
                            Log.d(TAG, response.body()!!.toString())
                            callback.onDetailTvShowReceived(response.body()!!)
                        }
                    } else {
                        Log.e(TAG, "onFailure: ${response.message()}")
                    }
                }

                override fun onFailure(call: Call<TvShowDetailResponse>, t: Throwable) {
                    Log.e(TAG, "onFailure: ${t.message.toString()}")
                }
            })
        } catch (e: JSONException) {
            e.printStackTrace()
        }
    }

    interface LoadMovieCallback {
        fun onAllMovieReceived(movieResponses: List<ResultsItemMovie>)
    }

    interface LoadTvShowCallback {
        fun onAllTvShowReceived(tvShowResponses: List<ResultsItemTV>)
    }

    interface LoadDetailMovieCallback {
        fun onDetailMovieReceived(detailMovieResponses: MovieDetailResponse)
    }

    interface LoadDetailTvShowCallback {
        fun onDetailTvShowReceived(detailTvShowResponses: TvShowDetailResponse)
    }

}