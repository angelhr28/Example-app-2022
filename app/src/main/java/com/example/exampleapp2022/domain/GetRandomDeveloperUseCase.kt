package com.example.exampleapp2022.domain

import com.example.exampleapp2022.data.DeveloperRepository
import com.example.exampleapp2022.domain.model.Developer
import javax.inject.Inject

class GetRandomDeveloperUseCase @Inject constructor(
    private val repository: DeveloperRepository,
) {
    suspend operator fun invoke(): Developer? {
        val developers = repository.getAllDevelopersFromDatabase()
        if (developers.isNotEmpty()) {
            val random = (developers.indices).random()
            return developers[random]
        }
        return null
    }
}