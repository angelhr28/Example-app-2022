package com.example.exampleapp2022.domain.model

import com.example.exampleapp2022.data.database.entities.DeveloperEntity
import com.example.exampleapp2022.data.model.DeveloperModel

data class Developer(
    val speciality: String,
    val author: String,
)

fun DeveloperModel.toDomain() = Developer(speciality, author)
fun DeveloperEntity.toDomain() = Developer(speciality, author)