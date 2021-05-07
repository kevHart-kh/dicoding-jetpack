package com.kh.filmku.data

import android.os.Parcelable
import com.kh.academy.data.source.MovieRepository
import com.kh.filmku.data.source.remote.response.MovieDetailResponse
import kotlinx.parcelize.Parcelize
import okhttp3.internal.format
import java.lang.Exception

@Parcelize
data class MovieEntity(
    var id: String = "",
    var title: String = "",
    var category: String = "",
    var year: String = "",
    var userScore: String = "",
    var overview: String = "",
    var duration: String = "",
    var imagePath: String = "",
    var isComplete: Boolean = false
):Parcelable{
    override fun toString(): String {
        return "MovieEntity(id='$id', title='$title', category='$category', year='$year', userScore='$userScore', overview='$overview', duration='$duration', imagePath='$imagePath')"
    }

    fun set(movieDetailResponse: MovieDetailResponse):Boolean {
        operator fun String.get(range: IntRange) = substring(range)
        var _duration = {
            try {
                val t = movieDetailResponse.runtime.toInt()
                val hours:Int = t / 60
                val minutes: Int = t % 60
                format("%dh %02dm", hours, minutes)
            }catch (e: Exception){
                movieDetailResponse.runtime
                throw e
            }
        }
        var _rating = {
            try {
                val t = movieDetailResponse.voteAverage.toDouble()
                "${(t*10).toInt()}%"
            }catch (e:Exception){
                movieDetailResponse.voteAverage
                throw e
            }
        }

        var _genre = {
            var genre = ""
            for (i in movieDetailResponse.genres){
                genre += "${i.name}, "
            }
            genre
        }

        id = movieDetailResponse.id
        title = movieDetailResponse.title
        category = _genre()
        year = movieDetailResponse.releaseDate[0..3]
        userScore = _rating()
        overview = movieDetailResponse.overview
        duration = _duration()
        imagePath = MovieRepository.IMAGE_BASE_PATH + movieDetailResponse.posterPath
        isComplete = true

        return true
    }
}
