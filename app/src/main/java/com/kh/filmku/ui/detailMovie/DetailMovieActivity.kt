package com.kh.filmku.ui.detailMovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.kh.filmku.R
import com.kh.filmku.data.MovieEntity
import com.kh.filmku.data.TvShowEntity
import com.kh.filmku.databinding.ActivityDetailMovieBinding
import com.kh.filmku.ui.detailTvShow.DetailTvShowViewModel
import com.kh.filmku.viewmodel.ViewModelFactory

class DetailMovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = getString(R.string.movie).toUpperCase()

        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[DetailMovieViewModel::class.java]

        if (intent.getParcelableExtra<MovieEntity>(EXTRA_MOVIE) != null){
            viewModel.setSelectedMovie(intent.getParcelableExtra(EXTRA_MOVIE)!!)
        }

        viewModel.getMovie().observe(this){movie ->
            with(movie){
                binding.tvMovTitle.text = "$title ($year)"
                binding.tvOverview.text = overview
                binding.tvGenre.text = category
                binding.tvDuration.text = duration
                binding.tvRating.text = userScore

                Glide.with(this@DetailMovieActivity)
                    .load(imagePath)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error))
                    .into(binding.imageView)
            }
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object{
        val EXTRA_MOVIE = "extra_movie"
    }
}