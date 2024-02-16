package com.robosofttest.api

import com.robosofttest.model.NewsResponse
import retrofit2.Response
import retrofit2.http.GET

interface NewsAPI {
    @GET("/v2/everything")
    suspend fun getNews(): Response<List<NewsResponse>>

}