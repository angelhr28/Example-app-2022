package com.example.exampleapp2022.domain

import com.example.exampleapp2022.data.DeveloperRepository

class GetDevelopers {
    private val repository = DeveloperRepository()
    suspend operator fun invoke() = repository.getAllQuotes()
}