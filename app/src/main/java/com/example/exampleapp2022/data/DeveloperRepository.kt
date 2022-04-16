package com.example.exampleapp2022.data

import com.example.exampleapp2022.data.database.dao.DeveloperDao
import com.example.exampleapp2022.data.database.entities.DeveloperEntity
import com.example.exampleapp2022.data.network.DeveloperService
import com.example.exampleapp2022.domain.model.Developer
import com.example.exampleapp2022.domain.model.toDomain
import javax.inject.Inject

class DeveloperRepository @Inject constructor(
    private val api: DeveloperService,
    private val developerDao: DeveloperDao,
) {
    suspend fun getAllDevelopersFromApi(): List<Developer> {
        val response = api.getDevelopers()
        return response.map { it.toDomain() }
    }

    suspend fun getAllDevelopersFromDatabase(): List<Developer> {
        val response = developerDao.getAllDeveloper()
        return response.map { it.toDomain() }
    }

    suspend fun insertDevelopers(developers: List<DeveloperEntity>) {
        developerDao.insertAll(developers)
    }

    suspend fun clearDevelopers() {
        developerDao.clearAll()
    }

}