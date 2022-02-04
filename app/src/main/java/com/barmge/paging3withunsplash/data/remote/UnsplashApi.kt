package com.barmge.paging3withunsplash.data.remote

import com.barmge.paging3withunsplash.BuildConfig
import com.barmge.paging3withunsplash.model.SearchResult
import com.barmge.paging3withunsplash.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/photos")
    suspend fun getAllImages(

        @Query("page") page : Int,
        @Query("per_page")per_page : Int

    ): List<UnsplashImage>

    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/search/photos")
    suspend fun searchImages(

        @Query("query") query : String,
        @Query("per_page")per_page : Int

    ): SearchResult
}