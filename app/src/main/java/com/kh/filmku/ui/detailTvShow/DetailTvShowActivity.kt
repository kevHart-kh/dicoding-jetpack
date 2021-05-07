package com.kh.filmku.ui.detailTvShow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.kh.filmku.R
import com.kh.filmku.data.TvShowEntity
import com.kh.filmku.databinding.ActivityDetailTvShowBinding
import com.kh.filmku.ui.home.movie.MovieViewModel
import com.kh.filmku.viewmodel.ViewModelFactory
import java.util.*

class DetailTvShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailTvShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = getString(R.string.tvShow).toUpperCase(Locale.getDefault())

        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[DetailTvShowViewModel::class.java]

        if (intent.getParcelableExtra<TvShowEntity>(EXTRA_TV_SHOW) != null){
            viewModel.setSelectedTvShow(intent.getParcelableExtra(EXTRA_TV_SHOW)!!)
        }

        viewModel.getTvShow().observe(this){tvShow ->
            with(tvShow){
                binding.tvTvTitle.text = "$title ($year)"
                binding.tvOverview.text = overview
                binding.tvDuration.text = duration
                binding.tvRating.text = userScore

                com.bumptech.glide.Glide.with(this@DetailTvShowActivity)
                    .load(imagePath)
                    .apply(
                        com.bumptech.glide.request.RequestOptions.placeholderOf(com.kh.filmku.R.drawable.ic_loading)
                            .error(com.kh.filmku.R.drawable.ic_error))
                    .into(binding.imageView)
            }
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object{
        const val EXTRA_TV_SHOW = "extra_tv_show"
    }
}