package com.kh.filmku.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class MovieDetailResponse(

	@field:SerializedName("original_language")
	val originalLanguage: String,

	@field:SerializedName("imdb_id")
	val imdbId: String,

	@field:SerializedName("video")
	val video: Boolean,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("backdrop_path")
	val backdropPath: String,

	@field:SerializedName("revenue")
	val revenue: Int,

	@field:SerializedName("genres")
	val genres: List<GenresItemMovie>,

	@field:SerializedName("popularity")
	val popularity: Double,

	@field:SerializedName("production_countries")
	val productionCountries: List<ProductionCountriesItemMovie>,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("vote_count")
	val voteCount: Int,

	@field:SerializedName("budget")
	val budget: Int,

	@field:SerializedName("overview")
	val overview: String,

	@field:SerializedName("original_title")
	val originalTitle: String,

	@field:SerializedName("runtime")
	val runtime: String,

	@field:SerializedName("poster_path")
	val posterPath: String,

	@field:SerializedName("spoken_languages")
	val spokenLanguages: List<SpokenLanguagesItemMovie>,

	@field:SerializedName("production_companies")
	val productionCompanies: List<ProductionCompaniesItemMovie>,

	@field:SerializedName("release_date")
	val releaseDate: String,

	@field:SerializedName("vote_average")
	val voteAverage: String,

	@field:SerializedName("belongs_to_collection")
	val belongsToCollection: Any,

	@field:SerializedName("tagline")
	val tagline: String,

	@field:SerializedName("adult")
	val adult: Boolean,

	@field:SerializedName("homepage")
	val homepage: String,

	@field:SerializedName("status")
	val status: String
)

data class GenresItemMovie(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("id")
	val id: Int
)

data class ProductionCountriesItemMovie(

	@field:SerializedName("iso_3166_1")
	val iso31661: String,

	@field:SerializedName("name")
	val name: String
)

data class SpokenLanguagesItemMovie(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("iso_639_1")
	val iso6391: String,

	@field:SerializedName("english_name")
	val englishName: String
)

data class ProductionCompaniesItemMovie(

	@field:SerializedName("logo_path")
	val logoPath: String,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("origin_country")
	val originCountry: String
)
