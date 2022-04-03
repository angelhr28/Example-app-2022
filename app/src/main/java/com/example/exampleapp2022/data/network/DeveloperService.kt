package com.example.exampleapp2022.data.network

import com.example.exampleapp2022.core.RetrofitHelper
import com.example.exampleapp2022.data.model.DeveloperModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DeveloperService {

    private val retrofit = RetrofitHelper.connect()

    suspend fun getDevelopers(): List<DeveloperModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(DeveloperApiClient::class.java).getAllQuotes()
            response.body() ?: emptyList()
        }
    }
}