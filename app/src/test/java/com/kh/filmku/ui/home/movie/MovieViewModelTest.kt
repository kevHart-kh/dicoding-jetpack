package com.kh.filmku.ui.home.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.*
import com.kh.academy.data.source.MovieRepository
import com.kh.filmku.data.MovieEntity
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class MovieViewModelTest {
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()
    @Mock
    private lateinit var viewModel: MovieViewModel
    private var movieRepository: MovieRepository = mock(MovieRepository::class.java)
    @Mock
    private lateinit var observer: Observer<List<MovieEntity>>

    @Before
    fun setUp() {
        viewModel = MovieViewModel(movieRepository)
    }

    @Test
    fun getMovie() {
        val dummyMovie = movieRepository.getAllMovie() // LiveData<List<MovieEntity>>
        val movie = MutableLiveData<List<MovieEntity>>() //MutableLiveData<List<MovieEntity>>
//        delayfiveSeconds()
        movie.value = dummyMovie.value


        `when`(dummyMovie).thenReturn(movie)
        val courseEntities = viewModel.getMovie().value
        verify(movieRepository).getAllMovie()
        assertNotNull(courseEntities)
//        assertEquals(5, courseEntities?.size)

        viewModel.getMovie().observeForever(observer)
        verify(observer).onChanged(dummyMovie.value)

    }

//    private fun delayfiveSeconds() {
//        try {
//            Thread.sleep(5_000)
//        }catch (e: Exception){
//            throw e
//        }
//    }
}