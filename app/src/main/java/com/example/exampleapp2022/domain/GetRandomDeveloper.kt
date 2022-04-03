package com.example.exampleapp2022.domain

import com.example.exampleapp2022.data.model.DeveloperModel
import com.example.exampleapp2022.data.model.DeveloperProvider
import javax.inject.Inject

class GetRandomDeveloper @Inject constructor(
    private val developerProvider: DeveloperProvider
) {
    operator fun invoke(): DeveloperModel? {
        val developers = developerProvider.developers
        if (developers.isNotEmpty()) {
            val random = (developers.indices).random()
            return developers[random]
        }
        return null
    }
}