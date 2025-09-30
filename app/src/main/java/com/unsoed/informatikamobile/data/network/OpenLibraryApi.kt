package com.unsoed.informatikamobile.data.network

import com.unsoed.informatikamobile.data.model.SearchResponse
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Response

interface OpenLibraryApi {

    @GET("search.json")
    suspend fun SearchBooks(
        @Query("q") query: String,
        @Query("limit") limit: Int
    ): Response<SearchResponse>
}