package com.kh.filmku.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kh.filmku.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)

        activityHomeBinding.apply {
            viewPager.adapter = sectionsPagerAdapter
            tabs.setupWithViewPager(activityHomeBinding.viewPager)
        }

        supportActionBar?.elevation = 0f
    }
}