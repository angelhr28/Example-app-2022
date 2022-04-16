package com.example.exampleapp2022.data.network

import com.example.exampleapp2022.data.model.DeveloperModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class DeveloperService @Inject constructor(
    private val api: DeveloperApiClient
) {

    suspend fun getDevelopers(): List<DeveloperModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getAllDevelopers()
            response.body() ?: emptyList()
        }
    }
}