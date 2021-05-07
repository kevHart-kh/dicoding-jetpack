package com.kh.filmku.data

import android.os.Parcelable
import com.kh.academy.data.source.MovieRepository
import com.kh.filmku.data.source.remote.response.TvShowDetailResponse
import kotlinx.parcelize.Parcelize
import okhttp3.internal.format
import java.lang.Exception

@Parcelize
data class TvShowEntity(
    var id:String = "",
    var title: String = "",
    var year: String = "",
    var userScore: String = "",
    var overview: String = "",
    var duration: String = "",
    var imagePath: String = ""

):Parcelable{
    fun set(tvShowDetailResponse: TvShowDetailResponse):Boolean {
        var _date = {
            operator fun String.get(range: IntRange) = substring(range)
            tvShowDetailResponse.firstAirDate[0..3]
        }

        var _duration = {
            try {
                val t = tvShowDetailResponse.episodeRunTime[0]
                val hours:Int = t / 60
                val minutes: Int = t % 60
                if (hours > 0) {
                    format("%dh %02dm", hours, minutes)
                }else{
                    format("%02dm", minutes)

                }
            }catch (e: Exception){
                tvShowDetailResponse.episodeRunTime[0]
                throw e
            }
        }
        var _rating = {
            val t = tvShowDetailResponse.voteAverage
            "${(t*10).toInt()}%"
        }

        this.id = tvShowDetailResponse.id
        this.title = tvShowDetailResponse.name
        this.year = _date()
        this.userScore = _rating()
        this.overview = tvShowDetailResponse.overview
        this.duration = _duration()
        this.imagePath = MovieRepository.IMAGE_BASE_PATH + tvShowDetailResponse.posterPath

        return true
    }
}
