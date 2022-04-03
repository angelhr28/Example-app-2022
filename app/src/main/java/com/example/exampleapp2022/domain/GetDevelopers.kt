package com.example.exampleapp2022.domain

import com.example.exampleapp2022.data.DeveloperRepository
import javax.inject.Inject

class GetDevelopers @Inject constructor(
    private val repository: DeveloperRepository
) {
    suspend operator fun invoke() = repository.getAllQuotes()
}