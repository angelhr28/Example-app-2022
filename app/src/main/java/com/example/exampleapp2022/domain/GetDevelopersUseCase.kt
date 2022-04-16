package com.example.exampleapp2022.domain

import android.util.Log
import com.example.exampleapp2022.data.DeveloperRepository
import com.example.exampleapp2022.data.database.entities.toDatabase
import com.example.exampleapp2022.domain.model.Developer
import javax.inject.Inject

class GetDevelopersUseCase @Inject constructor(
    private val repository: DeveloperRepository,
) {
    suspend operator fun invoke(): List<Developer> {
        val developers = repository.getAllDevelopersFromApi()
        return if (developers.isNotEmpty()) {
            repository.clearDevelopers()
            repository.insertDevelopers(developers.map { it.toDatabase() })
            developers
        } else {
            repository.getAllDevelopersFromDatabase()
        }
    }
}