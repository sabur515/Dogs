package com.example.dogs.api

import retrofit2.http.GET

const val BASE_URL = "http://dog.ceo/api/"

interface ApiRequest {

    @GET("breeds/image/random")
    suspend fun getRandomDog():ApiData
}