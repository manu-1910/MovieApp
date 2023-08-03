package com.movie.data.api

import retrofit2.http.GET
import retrofit2.http.Path

interface MovieService {

    @GET
    fun fetchKeywords(@Path("movie_id") id: Int):

}