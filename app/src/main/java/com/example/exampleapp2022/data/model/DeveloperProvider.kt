package com.example.exampleapp2022.data.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DeveloperProvider @Inject constructor() {
    var developers: List<DeveloperModel> = emptyList()
}