package com.example.exampleapp2022.domain

import com.example.exampleapp2022.data.model.DeveloperModel
import com.example.exampleapp2022.data.model.DeveloperProvider

class GetRandomDeveloper {
    operator fun invoke(): DeveloperModel? {
        val developers = DeveloperProvider.developers
        if (developers.isNotEmpty()) {
            val random = (developers.indices).random()
            return developers[random]
        }
        return null
    }
}