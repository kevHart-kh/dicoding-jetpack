package com.kh.filmku.ui.detailTvShow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.kh.academy.data.source.MovieRepository
import com.kh.filmku.data.MovieEntity
import com.kh.filmku.data.TvShowEntity
import com.kh.filmku.ui.home.movie.MovieViewModel
import com.kh.filmku.ui.home.tvshow.TvShowViewModel
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailTvShowViewModelTest {

    private lateinit var viewModel: TvShowViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Mock
    private lateinit var observer: Observer<List<TvShowEntity>>

    @Before
    fun setUp() {
        viewModel = TvShowViewModel(movieRepository)
    }

    @Test
    fun getTvShow() {
        val dummyCourses = movieRepository.getAllTvShow()
        val movie = MutableLiveData<List<TvShowEntity>>()
        movie.value = dummyCourses.value

        Mockito.`when`(movieRepository.getAllTvShow()).thenReturn(movie)
        val courseEntities = viewModel.getTvShow().value
        Mockito.verify(movieRepository).getAllMovie()
        Assert.assertNotNull(courseEntities)
        Assert.assertEquals(5, courseEntities?.size)

        viewModel.getTvShow().observeForever(observer)
        Mockito.verify(observer).onChanged(dummyCourses.value)
    }
}