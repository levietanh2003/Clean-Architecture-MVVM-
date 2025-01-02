package com.aliasadi.domain.usecase

import com.aliasadi.domain.repository.MovieRepository


class AddMovieToFavorite(
    private val movieRepository: MovieRepository
) {
    suspend operator fun invoke(movieId: Int) = movieRepository.addMovieToFavorite(movieId)
}