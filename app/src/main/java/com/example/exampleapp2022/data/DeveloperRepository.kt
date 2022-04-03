package com.example.exampleapp2022.data

import com.example.exampleapp2022.data.model.DeveloperModel
import com.example.exampleapp2022.data.model.DeveloperProvider
import com.example.exampleapp2022.data.network.DeveloperService
import javax.inject.Inject

class DeveloperRepository @Inject constructor(
    private val api: DeveloperService,
    private val developerProvider: DeveloperProvider
) {
    suspend fun getAllQuotes(): List<DeveloperModel> {
        val response = api.getDevelopers()
        developerProvider.developers = response
        return response
    }
}