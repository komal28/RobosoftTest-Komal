package com.robosofttest.di

import com.robosofttest.api.NewsAPI
import com.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {


    @Singleton
    @Provides
    fun providesRetrofit(): Retrofit.Builder {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
    }

    @Singleton
    @Provides
    fun providesNewsAPI(retrofitBuilder: Retrofit.Builder, okHttpClient: OkHttpClient): NewsAPI {
        return retrofitBuilder.client(okHttpClient).build().create(NewsAPI::class.java)
    }
}