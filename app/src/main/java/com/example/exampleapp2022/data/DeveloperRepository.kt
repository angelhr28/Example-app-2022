package com.example.exampleapp2022.data

import com.example.exampleapp2022.data.model.DeveloperModel
import com.example.exampleapp2022.data.model.DeveloperProvider
import com.example.exampleapp2022.data.network.DeveloperService

class DeveloperRepository {

    private val api = DeveloperService()

    suspend fun getAllQuotes(): List<DeveloperModel> {
        val response = api.getDevelopers()
        DeveloperProvider.developers = response
        return response
    }
}