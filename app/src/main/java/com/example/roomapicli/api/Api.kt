package com.example.roomapicli.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Api{
    private const val url = "https://jsonplaceholder.typicode.com/"
    /**
     * @return Retrofit instance for getting API data
     **/
    fun retrofit(): ApiInterface {
        val retrofit = Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(ApiInterface::class.java)
    }

}