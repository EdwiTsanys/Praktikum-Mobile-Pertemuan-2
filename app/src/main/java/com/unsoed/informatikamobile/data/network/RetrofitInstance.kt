package com.unsoed.informatikamobile.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.unsoed.informatikamobile.utils.Constans

object RetrofitInstance {
    val api: OpenLibraryApi by lazy {
        Retrofit.Builder()
            .baseUrl(Constans.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(OpenLibraryApi::class.java)
    }

}