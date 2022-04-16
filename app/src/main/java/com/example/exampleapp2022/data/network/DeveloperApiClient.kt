package com.example.exampleapp2022.data.network

import com.example.exampleapp2022.data.model.DeveloperModel
import retrofit2.Response
import retrofit2.http.GET

interface DeveloperApiClient {
    @GET("/.json")
    suspend fun getAllDevelopers(): Response<List<DeveloperModel>>
}